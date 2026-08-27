package coil3.compose;

import android.os.Trace;
import androidx.compose.ui.layout.ContentScale;
import coil3.RealImageLoader;
import coil3.compose.internal.UtilsKt;
import o.AndroidContentCaptureManager;
import o.PathDirection;
import o.PathFillTypeCompanion;
import o.ShaderKt;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.or;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncImagePainterKt {
    /* JADX INFO: renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final AsyncImagePainter m3981rememberAsyncImagePainter5jETZwI(Object obj, RealImageLoader realImageLoader, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ContentScale contentScale, int i, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        or orVar = (or) getpostalcode.write((getNewPassword) PathFillTypeCompanion.read);
        getpostalcode.serializer(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            ShaderKt shaderKtRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(obj, getpostalcode);
            UtilsKt.RemoteActionCompatParcelizer(shaderKtRemoteActionCompatParcelizer);
            PathDirection pathDirection = new PathDirection(realImageLoader, shaderKtRemoteActionCompatParcelizer, orVar);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new AsyncImagePainter(pathDirection);
                getpostalcode.write(objComponentActivity);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity2);
            }
            asyncImagePainter.PlaybackStateCompat = (getContentViewGroupParentLayout) objComponentActivity2;
            asyncImagePainter.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            asyncImagePainter.ParcelableVolumeInfo = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
            asyncImagePainter.serializer = contentScale;
            asyncImagePainter.MediaMetadataCompat = i;
            asyncImagePainter.PlaybackStateCompatCustomAction = UtilsKt.RemoteActionCompatParcelizer(getpostalcode);
            asyncImagePainter.write(pathDirection);
            getpostalcode.IconCompatParcelizer(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }
}
