package o;

import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract class toViewInfoFactory {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void RemoteActionCompatParcelizer(r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E r8lambdaqx04yjm8bydcf53rsookfgpin2e, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        TypographyToken typographyToken;
        String str;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdaqx04yjm8bydcf53rsookfgpin2e.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2034004982);
        if ((i & 6) == 0) {
            if (!((i & 8) == 0 ? getpostalcode.read(r8lambdaqx04yjm8bydcf53rsookfgpin2e) : getpostalcode.IconCompatParcelizer(r8lambdaqx04yjm8bydcf53rsookfgpin2e))) {
                i4 = 2;
            } else {
                int i6 = write + 113;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        boolean z = false;
        if ((i8 & 19) != 18) {
            int i9 = IconCompatParcelizer + 105;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i8 & 1, z)) {
            int i10 = IconCompatParcelizer + 67;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                modifier = androidx.compose.ui.Modifier.Companion;
                typographyToken = r8lambdaqx04yjm8bydcf53rsookfgpin2e.serializer;
                str = r8lambdaqx04yjm8bydcf53rsookfgpin2e.write;
                i3 = (i8 / 3) & 15243;
            } else {
                modifier = androidx.compose.ui.Modifier.Companion;
                typographyToken = r8lambdaqx04yjm8bydcf53rsookfgpin2e.serializer;
                str = r8lambdaqx04yjm8bydcf53rsookfgpin2e.write;
                i3 = (i8 << 3) & 896;
            }
            getDesignInfoListui_tooling.write(typographyToken, str, modifier, getpostalcode, i3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getScaleFromKey(r8lambdaqx04yjm8bydcf53rsookfgpin2e, modifier, i, 1);
        }
    }
}
