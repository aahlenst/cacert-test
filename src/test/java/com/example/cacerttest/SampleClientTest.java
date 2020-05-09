package com.example.cacerttest;

import org.junit.jupiter.api.Test;

import java.net.URI;

class SampleClientTest {

    @Test
    void callSiteWithKnownCa() throws Exception {
        new SampleClient().call(new URI("https://google.com/"));
    }

    @Test
    void callSiteWithUnknownCa() throws Exception {
        new SampleClient().call(new URI("https://api.insee.fr/catalogue/"));
    }
}
