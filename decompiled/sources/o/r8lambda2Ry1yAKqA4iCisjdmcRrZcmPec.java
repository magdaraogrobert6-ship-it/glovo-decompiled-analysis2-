package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda2Ry1yAKqA4iCisjdmcRrZcmPec implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        wouldPushPermissionPromptDisplaylambda5 wouldpushpermissionpromptdisplaylambda5 = (wouldPushPermissionPromptDisplaylambda5) obj2;
        ((r8lambda1h84ZU_cAR0h79mqUcr2O580IzE) ((wouldPushPermissionPromptDisplaylambda5) obj)).getClass();
        int i2 = 8;
        try {
            Class.forName("android.app.Application", false, r8lambda1h84ZU_cAR0h79mqUcr2O580IzE.class.getClassLoader());
            i = 8;
        } catch (Exception unused) {
            i = 3;
        }
        ((r8lambda1h84ZU_cAR0h79mqUcr2O580IzE) wouldpushpermissionpromptdisplaylambda5).getClass();
        try {
            Class.forName("android.app.Application", false, r8lambda1h84ZU_cAR0h79mqUcr2O580IzE.class.getClassLoader());
        } catch (Exception unused2) {
            i2 = 3;
        }
        return i - i2;
    }
}
