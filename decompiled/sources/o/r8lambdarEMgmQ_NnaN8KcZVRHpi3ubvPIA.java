package o;

import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ModelValidator")
public class r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA {
    private final parseLonglambda0 IconCompatParcelizer;
    private final getNotificationIdlambda0 read;

    public final boolean write(r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA r8lambdazar1jdaanwnnkjpt4lyd9nkrga, populatePushStoryPage populatepushstorypage) {
        boolean z;
        if (!r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat().equals(populatepushstorypage.MediaSessionCompatQueueItem()) || r8lambdazar1jdaanwnnkjpt4lyd9nkrga.read() != populatepushstorypage.IconCompatParcelizer()) {
            return false;
        }
        File fileRemoteActionCompatParcelizer = populatepushstorypage.RemoteActionCompatParcelizer();
        this.read.getClass();
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        FwFClientsyncClientsyncResult1 fwFClientsyncClientsyncResult1Write = getNotificationIdlambda0.write(fileRemoteActionCompatParcelizer, null, parselonglambda0);
        if (fwFClientsyncClientsyncResult1Write == null) {
            return false;
        }
        int iIconCompatParcelizer = fwFClientsyncClientsyncResult1Write.IconCompatParcelizer();
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] r8lambdawtrzz47alm_pihky7ggotparxmArr = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[iIconCompatParcelizer];
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            FwFClientupdateFeatures1 fwFClientupdateFeatures1IconCompatParcelizer = fwFClientsyncClientsyncResult1Write.IconCompatParcelizer(i);
            r8lambdawtrzz47alm_pihky7ggotparxmArr[i] = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientupdateFeatures1IconCompatParcelizer.write(), fwFClientupdateFeatures1IconCompatParcelizer.serializer());
        }
        int iSerializer = fwFClientsyncClientsyncResult1Write.serializer();
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] r8lambdawtrzz47alm_pihky7ggotparxmArr2 = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[iSerializer];
        for (int i2 = 0; i2 < iSerializer; i2++) {
            FwFClientupdateFeatures1 fwFClientupdateFeatures1RemoteActionCompatParcelizer = fwFClientsyncClientsyncResult1Write.RemoteActionCompatParcelizer(i2);
            r8lambdawtrzz47alm_pihky7ggotparxmArr2[i2] = new r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM(fwFClientupdateFeatures1RemoteActionCompatParcelizer.write(), fwFClientupdateFeatures1RemoteActionCompatParcelizer.serializer());
        }
        r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] r8lambdawtrzz47alm_pihky7ggotparxmArrSerializer = r8lambdazar1jdaanwnnkjpt4lyd9nkrga.serializer();
        if (r8lambdawtrzz47alm_pihky7ggotparxmArrSerializer.length == iIconCompatParcelizer) {
            int i3 = 0;
            while (true) {
                if (i3 >= r8lambdawtrzz47alm_pihky7ggotparxmArrSerializer.length) {
                    r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] r8lambdawtrzz47alm_pihky7ggotparxmArrMediaSessionCompatQueueItem = r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaSessionCompatQueueItem();
                    if (r8lambdawtrzz47alm_pihky7ggotparxmArrMediaSessionCompatQueueItem.length != iSerializer) {
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= r8lambdawtrzz47alm_pihky7ggotparxmArrMediaSessionCompatQueueItem.length) {
                            z = true;
                            break;
                        }
                        if (r8lambdawtrzz47alm_pihky7ggotparxmArrMediaSessionCompatQueueItem[i4].equals(r8lambdawtrzz47alm_pihky7ggotparxmArr2[i4])) {
                            i4++;
                        }
                    }
                } else if (r8lambdawtrzz47alm_pihky7ggotparxmArrSerializer[i3].equals(r8lambdawtrzz47alm_pihky7ggotparxmArr[i3])) {
                    i3++;
                }
                parselonglambda0.IconCompatParcelizer("Incompatible candidate model. Model wrapper %s (%d) expects inputs: %s, outputs: %s. Found model %s with inputs: %s, outputs: %s", r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat(), Integer.valueOf(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.read()), Arrays.toString(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.serializer()), Arrays.toString(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaSessionCompatQueueItem()), populatepushstorypage.serializer(), Arrays.toString(r8lambdawtrzz47alm_pihky7ggotparxmArr), Arrays.toString(r8lambdawtrzz47alm_pihky7ggotparxmArr2));
                z = false;
                break;
            }
        }
        parselonglambda0.IconCompatParcelizer("Incompatible candidate model. Model wrapper %s (%d) expects inputs: %s, outputs: %s. Found model %s with inputs: %s, outputs: %s", r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat(), Integer.valueOf(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.read()), Arrays.toString(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.serializer()), Arrays.toString(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaSessionCompatQueueItem()), populatepushstorypage.serializer(), Arrays.toString(r8lambdawtrzz47alm_pihky7ggotparxmArr), Arrays.toString(r8lambdawtrzz47alm_pihky7ggotparxmArr2));
        z = false;
        break;
        try {
            fwFClientsyncClientsyncResult1Write.close();
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to close interpreter", new Object[0]);
        }
        return z;
    }

    public r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA(parseLonglambda0 parselonglambda0, getNotificationIdlambda0 getnotificationidlambda0) {
        this.IconCompatParcelizer = parselonglambda0;
        this.read = getnotificationidlambda0;
    }
}
