package com.incognia.internal;

import android.net.IpPrefix;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.ProxyInfo;
import android.net.RouteInfo;
import android.net.Uri;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public final xus BGx(LinkProperties linkProperties) {
        String privateDnsServerName;
        Boolean boolValueOf;
        Inet4Address dhcpServerAddress;
        InetAddress address;
        Boolean boolValueOf2;
        wE wEVar;
        XUh xUh = XUh.BGx;
        if (XUh.BGx(xUh, 28, 0, 2)) {
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
            boolValueOf = Boolean.valueOf(linkProperties.isPrivateDnsActive());
        } else {
            privateDnsServerName = null;
            boolValueOf = null;
        }
        Integer numValueOf = XUh.BGx(xUh, 29, 0, 2) ? Integer.valueOf(linkProperties.getMtu()) : null;
        if (XUh.BGx(xUh, 30, 0, 2)) {
            dhcpServerAddress = linkProperties.getDhcpServerAddress();
            IpPrefix nat64Prefix = linkProperties.getNat64Prefix();
            address = nat64Prefix != null ? nat64Prefix.getAddress() : null;
            boolValueOf2 = Boolean.valueOf(linkProperties.isWakeOnLanSupported());
        } else {
            dhcpServerAddress = null;
            address = null;
            boolValueOf2 = null;
        }
        String hostAddress = dhcpServerAddress != null ? dhcpServerAddress.getHostAddress() : null;
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = dnsServers.iterator();
        while (it.hasNext()) {
            String hostAddress2 = ((InetAddress) it.next()).getHostAddress();
            if (hostAddress2 != null) {
                arrayList.add(hostAddress2);
            }
        }
        String domains = linkProperties.getDomains();
        ProxyInfo httpProxy = linkProperties.getHttpProxy();
        if (httpProxy != null) {
            String[] exclusionList = httpProxy.getExclusionList();
            List listRatingCompat = exclusionList != null ? onContentCardClicked.RatingCompat(exclusionList) : null;
            String host = httpProxy.getHost();
            Uri pacFileUrl = httpProxy.getPacFileUrl();
            wEVar = new wE(listRatingCompat, host, pacFileUrl != null ? pacFileUrl.getHost() : null, Integer.valueOf(httpProxy.getPort()));
        } else {
            wEVar = null;
        }
        String interfaceName = linkProperties.getInterfaceName();
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = linkAddresses.iterator();
        while (it2.hasNext()) {
            String hostAddress3 = ((LinkAddress) it2.next()).getAddress().getHostAddress();
            if (hostAddress3 != null) {
                arrayList2.add(hostAddress3);
            }
        }
        String hostAddress4 = address != null ? address.getHostAddress() : null;
        List<RouteInfo> routes = linkProperties.getRoutes();
        ArrayList arrayList3 = new ArrayList();
        for (RouteInfo routeInfo : routes) {
            String hostAddress5 = routeInfo.getDestination().getAddress().getHostAddress();
            InetAddress gateway = routeInfo.getGateway();
            arrayList3.add(new j49(hostAddress5, gateway != null ? gateway.getHostAddress() : null, routeInfo.getInterface()));
        }
        return new xus(hostAddress, arrayList, domains, wEVar, interfaceName, arrayList2, numValueOf, hostAddress4, privateDnsServerName, arrayList3, boolValueOf, boolValueOf2);
    }
}
