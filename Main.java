package com.company;
import com.auxilii.msgparser.Message;
import com.auxilii.msgparser.MsgParser;
import com.auxilii.msgparser.MsgParser;
import com.auxilii.msgparser.attachment.Attachment;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try{
            MsgParser msgp=new MsgParser();
            Message msg=msgp.parseMsg("C:\\Users\\krazpopov\\Documents\\TK Accesses - Different Domains.msg");
            String from_email=msg.getFromEmail();
            String inhalt = msg.getBodyText();
            System.out.println("from_email "+from_email);
           // System.out.println( "Inhalt "+inhalt);
            Pattern p = Pattern.compile("(?<=attached).*");
            Matcher m = p.matcher(inhalt);
            while(m.find()) {
                System.out.println(m.group());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }




    }
}
