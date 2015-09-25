package com.oracle.csm.soapjsonproxy.client;

public class SoapJsonProxyServiceTest {

    public static void main(final String[] args) {
        final SoapJsonProxyService ws = new SoapJsonProxyService();
        final Pessoa p = new Pessoa();
        p.setCpf("000.000.000-00");
        p.setId(1L);
        p.setNome("John Dow");
        System.out.println(ws.getSoapJsonProxyPortTypePort().callJson(p));
    }
}
