package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Forum test  suite")
public class ForumTestSuite {

    @DisplayName("\"When created SimpleUser with name, \" +\n" +
            "      \"then getUsername should return correct name\"")

    @Test
    void testCaseUsername()
    {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        String expectedResult = "theForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
