package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o.accessgetNegativeZerocp;
import o.accessgetPositiveZerocp;
import o.ceilslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ceilslo4al4 ceilslo4al4Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        accessgetPositiveZerocp accessgetpositivezerocpSerializer = remoteActionCompat.serializer;
        boolean z = true;
        if (ceilslo4al4Var.IconCompatParcelizer(1)) {
            accessgetpositivezerocpSerializer = ceilslo4al4Var.serializer();
        }
        remoteActionCompat.serializer = (IconCompat) accessgetpositivezerocpSerializer;
        CharSequence charSequence = remoteActionCompat.MediaDescriptionCompat;
        if (ceilslo4al4Var.IconCompatParcelizer(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat);
        }
        remoteActionCompat.MediaDescriptionCompat = charSequence;
        CharSequence charSequence2 = remoteActionCompat.read;
        if (ceilslo4al4Var.IconCompatParcelizer(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat);
        }
        remoteActionCompat.read = charSequence2;
        remoteActionCompat.IconCompatParcelizer = (PendingIntent) ceilslo4al4Var.read(remoteActionCompat.IconCompatParcelizer, 4);
        boolean z2 = remoteActionCompat.write;
        if (ceilslo4al4Var.IconCompatParcelizer(5)) {
            z2 = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.readInt() != 0;
        }
        remoteActionCompat.write = z2;
        boolean z3 = remoteActionCompat.RemoteActionCompatParcelizer;
        if (!ceilslo4al4Var.IconCompatParcelizer(6)) {
            z = z3;
        } else if (((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.RemoteActionCompatParcelizer = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ceilslo4al4 ceilslo4al4Var) {
        ceilslo4al4Var.getClass();
        IconCompat iconCompat = remoteActionCompat.serializer;
        ceilslo4al4Var.serializer(1);
        ceilslo4al4Var.write(iconCompat);
        CharSequence charSequence = remoteActionCompat.MediaDescriptionCompat;
        ceilslo4al4Var.serializer(2);
        Parcel parcel = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.read;
        ceilslo4al4Var.serializer(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.IconCompatParcelizer;
        ceilslo4al4Var.serializer(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.write;
        ceilslo4al4Var.serializer(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.RemoteActionCompatParcelizer;
        ceilslo4al4Var.serializer(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
