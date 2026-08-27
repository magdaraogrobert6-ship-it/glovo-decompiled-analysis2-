package o;

import android.net.Uri;
import androidx.navigation.NavController$onBackPressedCallback$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import java.util.Iterator;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class addRect implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ relativeMoveTo IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ addRect(relativeMoveTo relativemoveto, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = relativemoveto;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        relativeMoveTo relativemoveto = this.IconCompatParcelizer;
        boolean z = false;
        int i6 = 1;
        switch (i5) {
            case 0:
                NavController$onBackPressedCallback$1 navController$onBackPressedCallback$1 = relativemoveto.MediaSessionCompatQueueItem;
                if (relativemoveto.RemoteActionCompatParcelizer) {
                    BrazeContentCardsManager brazeContentCardsManager = relativemoveto.read.MediaSessionCompatQueueItem;
                    if (brazeContentCardsManager == null || !brazeContentCardsManager.isEmpty()) {
                        Iterator it = brazeContentCardsManager.iterator();
                        int i7 = 0;
                        while (it.hasNext()) {
                            if (!(((cubicTo) it.next()).IconCompatParcelizer instanceof relativeQuadraticTo) && (i7 = i7 + 1) < 0) {
                                androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                                throw null;
                            }
                        }
                        if (i7 > 1) {
                            z = true;
                        }
                    } else {
                        int i8 = read + 51;
                        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                    }
                }
                navController$onBackPressedCallback$1.setEnabled(z);
                return createfromparcel;
            case 1:
                getNativePathEffect getnativepatheffect = new getNativePathEffect(relativemoveto.write, relativemoveto.read.IconCompatParcelizer);
                int i10 = write + 21;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return getnativepatheffect;
            case 2:
                relativeMoveTo.RemoteActionCompatParcelizer(relativemoveto, "reset-password?userName={userName}", false);
                return createfromparcel;
            case 3:
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Navigating to welcome screen", new Object[0]);
                relativeMoveTo.IconCompatParcelizer(relativemoveto, "welcome", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(26)), 4);
                int i12 = read + 43;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return createfromparcel;
            case 4:
                relativemoveto.write();
                return createfromparcel;
            case 5:
                relativemoveto.RemoteActionCompatParcelizer("sign-in", new C0188n(relativemoveto, 3));
                return createfromparcel;
            case 6:
                relativemoveto.write();
                return createfromparcel;
            case 7:
                relativeMoveTo.IconCompatParcelizer(relativemoveto, ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("account-creation?resultCode=", Uri.encode(""), "&phoneNumber=", Uri.encode(""), "&originalMessageId="), Uri.encode(""), "&retryCount=0"), null, 6);
                return createfromparcel;
            case 8:
                relativeMoveTo.IconCompatParcelizer(relativemoveto, "welcome", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(29)), 4);
                return createfromparcel;
            case 9:
                relativeMoveTo.IconCompatParcelizer(relativemoveto, "country-selection", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new NafathLogger$$ExternalSyntheticLambda0(i6)), 4);
                return createfromparcel;
            default:
                relativeMoveTo.IconCompatParcelizer(relativemoveto, "sign-in", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new NafathLogger$$ExternalSyntheticLambda0(i)), 4);
                return createfromparcel;
        }
    }
}
