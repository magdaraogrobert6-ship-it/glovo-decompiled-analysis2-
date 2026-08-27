package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton11cp {
    public static final accessgetButton11cp IconCompatParcelizer;
    public static final String RemoteActionCompatParcelizer;
    public static final Set serializer;
    public static final accessgetButton11cp write;
    public final String MediaSessionCompatQueueItem;
    public final String read;

    public accessgetButton11cp(String str, String str2) {
        this.MediaSessionCompatQueueItem = str;
        this.read = str2;
    }

    public static accessgetButton11cp write(byte[] bArr) {
        String str = new String(bArr, Charset.forName(com.adjust.sdk.Constants.ENCODING));
        if (str.startsWith("1$")) {
            String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
            if (strArrSplit.length == 2) {
                String str2 = strArrSplit[0];
                if (!str2.isEmpty()) {
                    String str3 = strArrSplit[1];
                    return new accessgetButton11cp(str2, str3.isEmpty() ? null : str3);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Missing endpoint in CCTDestination extras");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Version marker missing from extras");
        return null;
    }

    static {
        String strRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        RemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2 = removeNodeAtDepth.RemoteActionCompatParcelizer("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strRemoteActionCompatParcelizer3 = removeNodeAtDepth.RemoteActionCompatParcelizer("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        serializer = Collections.unmodifiableSet(new HashSet(Arrays.asList(new accessgetButton10cp("proto"), new accessgetButton10cp("json"))));
        write = new accessgetButton11cp(strRemoteActionCompatParcelizer, null);
        IconCompatParcelizer = new accessgetButton11cp(strRemoteActionCompatParcelizer2, strRemoteActionCompatParcelizer3);
    }
}
