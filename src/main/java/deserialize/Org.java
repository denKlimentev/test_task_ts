package deserialize;


import com.fasterxml.jackson.databind.ObjectMapper;
import logic.dto.OrgDto;
import lombok.SneakyThrows;

import java.net.URL;


public class Org {

    private static final String DATA_ORG_JSON = "/data/org.json";

    @SneakyThrows
    public OrgDto getDate() {
        URL resource = Object.class.getResource(DATA_ORG_JSON);

        ObjectMapper mapper = new ObjectMapper();
        OrgDto orgBuilder = mapper.readValue(resource, OrgDto.class);

        return orgBuilder;
    }

}
