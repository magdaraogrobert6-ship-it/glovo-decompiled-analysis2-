package o;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKtobtainUiMediaScope21invokeinlinedonDispose1 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.graphics.Shape MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaMetadataCompat;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ androidx.compose.ui.text.input.VisualTransformation MediaSessionCompatToken;
    public final /* synthetic */ String PlaybackStateCompat;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl serializer;
    public final /* synthetic */ androidx.compose.material3.TextFieldColors write;

    public MediaQuery_androidKtobtainUiMediaScope21invokeinlinedonDispose1(String str, boolean z, boolean z2, androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, androidx.compose.material3.TextFieldColors textFieldColors, androidx.compose.ui.graphics.Shape shape) {
        this.PlaybackStateCompat = str;
        this.RemoteActionCompatParcelizer = z;
        this.RatingCompat = z2;
        this.MediaSessionCompatToken = visualTransformation;
        this.serializer = mutableInteractionSourceImpl;
        this.read = z3;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        this.MediaBrowserCompatMediaItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        this.MediaMetadataCompat = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
        this.write = textFieldColors;
        this.MediaDescriptionCompat = shape;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 4 : 2;
        }
        int i = iIntValue;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 19) != 18)) {
            androidx.compose.material3.OutlinedTextFieldDefaults outlinedTextFieldDefaults = androidx.compose.material3.OutlinedTextFieldDefaults.IconCompatParcelizer;
            androidx.compose.ui.graphics.Shape shape = this.MediaDescriptionCompat;
            boolean z = this.RemoteActionCompatParcelizer;
            boolean z2 = this.read;
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.serializer;
            androidx.compose.material3.TextFieldColors textFieldColors = this.write;
            outlinedTextFieldDefaults.IconCompatParcelizer(this.PlaybackStateCompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z, this.RatingCompat, this.MediaSessionCompatToken, mutableInteractionSourceImpl, z2, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper, this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat, textFieldColors, null, coil3.ExtrasKt.write(-656940872, new dispose(z, z2, mutableInteractionSourceImpl, textFieldColors, shape), getpostalcode), getpostalcode, (i << 3) & 112, 14155776);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
