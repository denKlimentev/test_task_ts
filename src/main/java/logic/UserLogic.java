package logic;

import deserialize.User;
import logic.builders.UserBuilder;
import page.st.Contacts;

import static com.codeborne.selenide.Selenide.$;

public class UserLogic {

    public UserBuilder createUser(){
       return new User().getDate();
    }

    public void writeMessage(UserBuilder user){
        $(Contacts.parentForm,Contacts.emailInput).setValue(user.getEmail());
        $(Contacts.parentForm,Contacts.nameInput).setValue(user.getName());
        $(Contacts.parentForm,Contacts.phoneInput).setValue(user.getPhone());
        $(Contacts.parentForm, Contacts.messageInput).setValue(user.getText());
    }


    public void sendMessage(){
        $(Contacts.parentForm, Contacts.sendButton).click();

    }
}
