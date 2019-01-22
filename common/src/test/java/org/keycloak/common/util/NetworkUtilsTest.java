package org.keycloak.common.util;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.keycloak.common.util.NetworkUtils;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkUtilsTest {

  @Test
  public void formatAddressInputByte() throws UnknownHostException {
    InetAddress inet = InetAddress.getByAddress(new byte[] {-64,-88,1,-2});
    Assert.assertEquals(NetworkUtils.formatAddress(inet), "192.168.1.254");
  }

}
