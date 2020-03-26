package logic.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserBuilder {

    private  String email;
    private  String name;
    private  String phone;
    private  String text;

    @Builder

    public UserBuilder(String emal, String phone, String name, String text) {
        this.email = emal;
        this.phone = phone;
        this.name = name;
        this.text = text;
    }
}
