package com.example.readerwebdemo.model;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Service
public class Xmlrdr {

    public String xmlparse(File file ) throws IOException {
        int startingrefid = 1;
        XmlMapper xmlMapper = new XmlMapper();
        StringBuilder build = new StringBuilder();
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().datePattern("yyyyMMdd").preferNullOverDefault(true).sheetIndex(0).build();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<PatientInfo> sheet1 = Poiji.fromExcel(file, PatientInfo.class, options);
        Iterator var7 = sheet1.iterator();

        while (var7.hasNext()) {
            PatientInfo p = (PatientInfo) var7.next();
            p.setPatient_fmp_Ssn("20/" + p.getPatient_fmp_Ssn());
            ++startingrefid;
            p.setReferral_id(startingrefid);
            p.setAdditional_comments(p.getAdditional_comments().replace("'", "''"));
            p.setClinic_Specialty(p.getClinic_Specialty().replace("'", "''"));
            p.setPatient_name(p.getPatient_Lname() + "," + p.getPatient_Fname());
            p.setOrder_id_Number(p.getOrder_id_Number().substring(5));
            build.append(xmlMapper.writeValueAsString(p));
        }


        FileWriter writer = new FileWriter("D:\\Work Downloads\\XMLdata1.xml");
        writer.write(build.toString());
        writer.close();
        return build.toString();
    }
}
