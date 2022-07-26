package com.blz.userresistration;

import org.junit.Assert;
import org.junit.Test;

public class UserResistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameStartWithCapitalAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateFirstName("Bhakti");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenFirstNameStartWithLowercaseAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateFirstName("bhakti");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void givenFirstNameStartWithCapitalAndMinimumTwoCharacter() {
        Boolean actual = userRegistration.validateFirstName("Bha");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenLastNameStartWithCapitalAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateLastName("Rohane");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenLastNameStartWithLowerCaseAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateLastName("rohane");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void givenMobileNumberCountryFollowBySpaceWithTenDigitNumber() {
        Boolean actual = userRegistration.validateMobileNumber("91 9890305550");
        Assert.assertEquals(true, actual);

    }

    @Test
    public void givenPasswordOneUpperCaseOneSpecialCharacterOneNumericNumberMinimumEightCharacter() {
        Boolean actual = userRegistration.validatePassword("Green4*apple");
        Assert.assertEquals(true, actual);
    }

    private class UserRegistration {
        public Boolean validateFirstName(String bhakti) {
            return null;
        }

        public Boolean validateLastName(String rohane) {
            return null;
        }

        public Boolean validateMobileNumber(String s) {
            return null;
        }

        public Boolean validatePassword(String s) {
            return null;
        }
    }
}
