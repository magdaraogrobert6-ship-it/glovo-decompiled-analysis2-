package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public enum isValidLogPurchaseInputlambda4 {
    INSTANCE;

    public List<InetAddress> resolveAddress(String str) throws UnknownHostException {
        return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
    }
}
