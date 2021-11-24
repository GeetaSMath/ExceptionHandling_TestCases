package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class EmailTestParameterized {
    UserRegistrationException user = new UserRegistrationException();
    private String emailTest;
    private boolean expected;

    public EmailTestParameterized(String emailTest, boolean expected){
        super();
        this.emailTest = emailTest;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object> input() {
        final Collection<Object> objects = (Collection<Object>) Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                new Object[]{"abc-10@yahoo.com", true},
                new Object[]{"abc.1010@yahoo.com", true},
                new Object[]{"abc222@abc.com", true},
                new Object[]{"abc.100@abc.com", true},
                new Object[]{"abc@1.com", true},
                new Object[]{"abc123@gamil.a", true},
                new Object[]{"abc123@yahoo.com", true},
                new Object[]{"abc@gmail.com", true},
                {"abc404@gamil.com", true},
                {"abc-100@abc.net", true}});
        return objects;
    }

    @Test
    public  void givenEmailsAspertheParameters(){
        boolean check = user.emailUniversal(emailTest);
        Assert.assertEquals(expected, check);
    }


}



