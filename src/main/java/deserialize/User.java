package deserialize;


import com.fasterxml.jackson.databind.ObjectMapper;
import logic.builders.UserBuilder;
import lombok.SneakyThrows;

import java.net.URL;

public class User {

    public static final String PATH_USER = "/data/user.json";


    @SneakyThrows
    public UserBuilder getDate() {

        URL resource = Object.class.getResource(PATH_USER);

        ObjectMapper mapper = new ObjectMapper();
        UserBuilder uesr = mapper.readValue(resource, UserBuilder.class);

        return uesr;
    }

}
