package o;

import com.roadrunner.settings.ui.components.PreferenceItemKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambda_v3K3qRoEuaXipwu4kB6dWEc1D8 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public /* synthetic */ r8lambda_v3K3qRoEuaXipwu4kB6dWEc1D8(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, int i) {
        this.IconCompatParcelizer = i;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        androidx.compose.ui.Modifier modifier;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z = false;
        if (i4 == 0) {
            if ((iIntValue & 3) != 2) {
                int i5 = MediaMetadataCompat;
                int i6 = i5 + 109;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i5 + 5;
                MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = true;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                PreferenceItemKt.write(this.write, this.RemoteActionCompatParcelizer, this.serializer, this.read, this.MediaBrowserCompatMediaItem, null, null, getpostalcode, 0, 48);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i10 = MediaDescriptionCompat + 71;
            MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.write;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.read;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = this.MediaBrowserCompatMediaItem;
                modifier = null;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = null;
                i = 1;
                i2 = 73;
            } else {
                r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.write;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.read;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = this.MediaBrowserCompatMediaItem;
                modifier = null;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = null;
                i = 0;
                i2 = 48;
            }
            PreferenceItemKt.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode2, i, i2);
        }
        return createfromparcel;
    }
}
