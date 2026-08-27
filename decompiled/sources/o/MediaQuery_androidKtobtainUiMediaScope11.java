package o;

import bo.app.d0$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKtobtainUiMediaScope11 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 ComponentActivity;
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl IconCompatParcelizer;
    public final /* synthetic */ getCenterHorizontally MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.text.TextStyle MediaMetadataCompat;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.ui.graphics.Shape MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatToken;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 PlaybackStateCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier PlaybackStateCompatCustomAction;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ getBottomEnd RemoteActionCompatParcelizer;
    public final /* synthetic */ String ResultReceiver;
    public final /* synthetic */ boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final /* synthetic */ androidx.compose.ui.text.input.VisualTransformation r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ androidx.compose.material3.TextFieldColors write;

    public MediaQuery_androidKtobtainUiMediaScope11(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.material3.TextFieldColors textFieldColors, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, androidx.compose.ui.text.TextStyle textStyle, getCenterHorizontally getcenterhorizontally, getBottomEnd getbottomend, boolean z3, int i, int i2, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, androidx.compose.ui.graphics.Shape shape) {
        this.PlaybackStateCompatCustomAction = modifier;
        this.read = z;
        this.write = textFieldColors;
        this.ResultReceiver = str;
        this.ParcelableVolumeInfo = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = z2;
        this.MediaMetadataCompat = textStyle;
        this.MediaBrowserCompatMediaItem = getcenterhorizontally;
        this.RemoteActionCompatParcelizer = getbottomend;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z3;
        this.RatingCompat = i;
        this.MediaDescriptionCompat = i2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = visualTransformation;
        this.IconCompatParcelizer = mutableInteractionSourceImpl;
        this.PlaybackStateCompat = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        this.MediaSessionCompatToken = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        this.ComponentActivity = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
        this.MediaSessionCompatResultReceiverWrapper = shape;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        long j;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode.serializer(-903106918);
            getpostalcode.IconCompatParcelizer(false);
            androidx.compose.ui.Modifier modifierThen = this.PlaybackStateCompatCustomAction.then(androidx.compose.ui.Modifier.Companion);
            String str = setFocusable.read(getpostalcode, androidx.compose.ui.R.string.default_error_message);
            float f = androidx.compose.material3.internal.TextFieldImplKt.MediaSessionCompatQueueItem;
            boolean z = this.read;
            if (z) {
                modifierThen = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifierThen, false, new d0$$ExternalSyntheticLambda4(str, 2), 1, null);
            }
            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(modifierThen, androidx.compose.material3.OutlinedTextFieldDefaults.RemoteActionCompatParcelizer, androidx.compose.material3.OutlinedTextFieldDefaults.serializer);
            androidx.compose.material3.TextFieldColors textFieldColors = this.write;
            if (z) {
                j = textFieldColors.ParcelableVolumeInfo;
            } else {
                j = textFieldColors.RemoteActionCompatParcelizer;
            }
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(j, null);
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.ComponentActivity;
            androidx.compose.ui.graphics.Shape shape = this.MediaSessionCompatResultReceiverWrapper;
            String str2 = this.ResultReceiver;
            boolean z2 = this.serializer;
            boolean z3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            androidx.compose.ui.text.input.VisualTransformation visualTransformation = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.IconCompatParcelizer;
            androidx.compose.foundation.text.BasicTextFieldKt.read(str2, this.ParcelableVolumeInfo, modifierWrite, z2, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, z3, this.RatingCompat, this.MediaDescriptionCompat, visualTransformation, null, mutableInteractionSourceImpl, solidColor, coil3.ExtrasKt.write(-1189274459, new MediaQuery_androidKtobtainUiMediaScope21invokeinlinedonDispose1(str2, z2, z3, visualTransformation, mutableInteractionSourceImpl, this.read, this.PlaybackStateCompat, this.MediaSessionCompatQueueItem, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.MediaSessionCompatToken, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, textFieldColors, shape), getpostalcode), getpostalcode, 0, 196608, androidx.compose.ui.graphics.Fields.TransformOrigin);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
