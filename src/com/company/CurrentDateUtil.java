package com.company;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.DataLengthException;

import java.util.Date;

public class CurrentDateUtil {
    public  static long currentUnixStamp(){
        Date now=new Date();
        return new Date().getTime();
    }
}
