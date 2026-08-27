package o;

import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComponentDialogExternalSyntheticLambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static LasagnaDeclineBottomSheet write() {
        int i = 2 % 2;
        LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = new LasagnaDeclineBottomSheet();
        int i2 = write + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return lasagnaDeclineBottomSheet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hasNonInteropFocusableContent RemoteActionCompatParcelizer(hasNonInteropFocusableContent hasnoninteropfocusablecontent, hasNonInteropFocusableContent hasnoninteropfocusablecontent2) {
        java.util.Locale locale;
        int i = 2 % 2;
        if (hasnoninteropfocusablecontent == null || hasnoninteropfocusablecontent.read.RemoteActionCompatParcelizer.isEmpty()) {
            return hasNonInteropFocusableContent.IconCompatParcelizer;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < hasnoninteropfocusablecontent2.read() + hasnoninteropfocusablecontent.read(); i2++) {
            if (i2 < hasnoninteropfocusablecontent.read()) {
                locale = hasnoninteropfocusablecontent.read(i2);
            } else {
                locale = hasnoninteropfocusablecontent2.read(i2 - hasnoninteropfocusablecontent.read());
                int i3 = write + 25;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            if (locale != null) {
                linkedHashSet.add(locale);
                int i5 = write + 71;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        return new hasNonInteropFocusableContent(new moveFocusaToIllA(new android.os.LocaleList((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]))));
    }
}
