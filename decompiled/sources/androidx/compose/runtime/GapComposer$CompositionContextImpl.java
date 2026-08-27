package androidx.compose.runtime;

import coil3.Extras$Key;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.AndroidContentCaptureManager;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextAnnouncementContentCardView;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.getBirthDateMonth;
import o.getBirthDateYear;
import o.getCreditCardExpirationDate;
import o.getCreditCardSecurityCode;
import o.getHandlerui;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;

/* JADX INFO: loaded from: classes.dex */
public final class GapComposer$CompositionContextImpl extends getBirthDateYear {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ getPostalCode MediaSessionCompatQueueItem;
    public HashSet RatingCompat;
    public final relocationOffsetfbGrOKE RemoteActionCompatParcelizer;
    public final boolean read;
    public final long serializer;
    public final boolean write;

    @Override // o.getBirthDateYear
    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.getBirthDateYear
    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.getBirthDateYear
    public final long read() {
        return this.serializer;
    }

    @Override // o.getBirthDateYear
    public final awaitTouchSlopOrCancellationjO51t88 IconCompatParcelizer(getCreditCardSecurityCode getcreditcardsecuritycode, getHandlerui gethandlerui, awaitTouchSlopOrCancellationjO51t88 awaittouchsloporcancellationjo51t88) {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(getcreditcardsecuritycode, gethandlerui, awaittouchsloporcancellationjo51t88);
    }

    @Override // o.getBirthDateYear
    public final awaitTouchSlopOrCancellationjO51t88 IconCompatParcelizer(getCreditCardSecurityCode getcreditcardsecuritycode, getHandlerui gethandlerui, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(getcreditcardsecuritycode, gethandlerui, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.getBirthDateYear
    public final void IconCompatParcelizer(getCreditCardSecurityCode getcreditcardsecuritycode) {
        this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(getcreditcardsecuritycode);
    }

    @Override // o.getBirthDateYear
    public final DragAndDropNodestartDragAndDropTransfer1 MediaBrowserCompatMediaItem() {
        return (DragAndDropNodestartDragAndDropTransfer1) ((onShowTranslationui) this.IconCompatParcelizer).getValue();
    }

    @Override // o.getBirthDateYear
    public final TextAnnouncementContentCardView MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaDescriptionCompat();
    }

    @Override // o.getBirthDateYear
    public final getCreditCardExpirationDate MediaMetadataCompat() {
        return this.MediaSessionCompatQueueItem.MediaDescriptionCompat;
    }

    @Override // o.getBirthDateYear
    public final boolean MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[LOOP:0: B:9:0x0018->B:22:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[EDGE_INSN: B:26:0x0067->B:23:0x0067 BREAK  A[LOOP:0: B:9:0x0018->B:22:0x0064], SYNTHETIC] */
    public final void MediaSessionCompatToken() {
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.RemoteActionCompatParcelizer;
        if (relocationoffsetfbgroke.read()) {
            HashSet hashSet = this.RatingCompat;
            if (hashSet != null) {
                Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    getPostalCode getpostalcode = (getPostalCode) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(getpostalcode.RatingCompat());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            relocationoffsetfbgroke.serializer();
        }
    }

    @Override // o.getBirthDateYear
    public final void RatingCompat() {
        this.MediaSessionCompatQueueItem.MediaSessionCompatQueueItem++;
    }

    @Override // o.getBirthDateYear
    public final void RemoteActionCompatParcelizer(getCreditCardSecurityCode getcreditcardsecuritycode) {
        this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(getcreditcardsecuritycode);
    }

    @Override // o.getBirthDateYear
    public final void read(getCreditCardSecurityCode getcreditcardsecuritycode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read(getcreditcardsecuritycode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.getBirthDateYear
    public final getBirthDateMonth serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @Override // o.getBirthDateYear
    public final void serializer(getHandleruiannotations gethandleruiannotations) {
        this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer(gethandleruiannotations);
    }

    @Override // o.getBirthDateYear
    public final boolean serializer() {
        return this.MediaSessionCompatQueueItem.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer();
    }

    @Override // o.getBirthDateYear
    public final void write() {
        this.MediaSessionCompatQueueItem.MediaSessionCompatQueueItem--;
    }

    @Override // o.getBirthDateYear
    public final void write(getCreditCardSecurityCode getcreditcardsecuritycode) {
        getPostalCode getpostalcode = this.MediaSessionCompatQueueItem;
        getpostalcode.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(getpostalcode.MediaDescriptionCompat);
        getpostalcode.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write(getcreditcardsecuritycode);
    }

    @Override // o.getBirthDateYear
    public final void write(getPostalCode getpostalcode) {
        this.RemoteActionCompatParcelizer.serializer(getpostalcode);
    }

    public GapComposer$CompositionContextImpl(getPostalCode getpostalcode, long j, boolean z, boolean z2, Extras$Key extras$Key) {
        this.MediaSessionCompatQueueItem = getpostalcode;
        this.serializer = j;
        this.write = z;
        this.read = z2;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = new relocationOffsetfbGrOKE();
        this.IconCompatParcelizer = new ParcelableSnapshotMutableState(DragAndDropNodestartDragAndDropTransfer1.IconCompatParcelizer, AndroidContentCaptureManager.read);
    }

    @Override // o.getBirthDateYear
    public final void RemoteActionCompatParcelizer(getPostalCode getpostalcode) {
        HashSet<Set> hashSet = this.RatingCompat;
        if (hashSet != null) {
            for (Set set : hashSet) {
                getpostalcode.getClass();
                set.remove(getpostalcode.RatingCompat());
            }
        }
        if (getpostalcode != null) {
            this.RemoteActionCompatParcelizer.write(getpostalcode);
        }
    }

    @Override // o.getBirthDateYear
    public final void IconCompatParcelizer(Set set) {
        HashSet hashSet = this.RatingCompat;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.RatingCompat = hashSet;
        }
        hashSet.add(set);
    }
}
