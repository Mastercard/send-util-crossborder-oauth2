package com.mastercard.oauth2.requesttoken.generator;

import com.mastercard.oauth2.requesttoken.models.TokenInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oauth2RequestTokenGeneratorTest {

    private static final Logger log = LoggerFactory.getLogger(Oauth2RequestTokenGeneratorTest.class);
    private static final String EMPTY_STR = "";

    private static String consumerKey;
    private static String keyAlias;
    private static String keyStorePassword;
    private static String p12File;

    @Before
    public void init(){
        consumerKey = "<Enter your complete consumer Key>";
        //ex.consumerKey = "aWvYEcc91223344b4MtanKFGgugCizL7-clmJiKSE60d968e0!977b121bce1c4e14833e6939abdb766f0000000000000000";

        keyAlias = "<Enter your keyalias>";
        //ex. keyAlias = "keyalias";

        keyStorePassword = "<Enter your keyStorePassword>";
        //ex. keyStorePassword = "keyStorePassword";

        //Save your P12 file in some folder and give its path with filename
        p12File = "<Enter your p12 file along with path>";
        // ex. p12File = "keyalias-xb-services.p12";
    }
    @Test
    public void testGenerateToken() {
        TokenInput tokenInput = TokenInput.builder()
            .consumerKey(consumerKey)
            .build();
        Oauth2RequestTokenGenerator oauth2RequestTokenGenerator = new Oauth2RequestTokenGenerator(p12File,
            keyAlias,
            keyStorePassword);

        String token = oauth2RequestTokenGenerator.generateToken(tokenInput);
        log.info("Request / client assertion token : " + token);
        Assert.assertNotEquals( EMPTY_STR, token);
    }
}
