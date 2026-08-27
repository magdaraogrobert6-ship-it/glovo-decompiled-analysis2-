package androidx.compose.animation.core;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.math.MathKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BoxKt;
import o.FlowLayoutKt;
import o.PaddingKt;
import o.PopulateViewStructure_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SizeKt;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPersonLastName;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.offsetVpY3zN4default;
import o.onCreateVirtualViewTranslationRequestsui;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.paddingVpY3zN4default;
import o.paddingqDBjuR0default;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requiredSize3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public final class Transition {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final Transition MediaDescriptionCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public final TransitionState MediaSessionCompatToken;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompat;
    public final getPersonLastName PlaybackStateCompatCustomAction;
    public final SnapshotStateList RemoteActionCompatParcelizer;
    public final SnapshotStateList read;
    public final String write;
    public final PopulateViewStructure_androidKt serializer = AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(0);
    public final PopulateViewStructure_androidKt RatingCompat = AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(Long.MIN_VALUE);

    public final paddingqDBjuR0default IconCompatParcelizer() {
        return (paddingqDBjuR0default) this.MediaMetadataCompat.getValue();
    }

    public final long RemoteActionCompatParcelizer() {
        return ((Number) this.PlaybackStateCompatCustomAction.getValue()).longValue();
    }

    public final long calculateTotalDurationNanos() {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((onCreateVirtualViewTranslationRequestsui) ((requiredSize3ABfNKs) snapshotStateList.get(i)).serializer).RemoteActionCompatParcelizer());
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((Transition) snapshotStateList2.get(i2)).calculateTotalDurationNanos());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearInitialAnimations$animation_core() {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) snapshotStateList.get(i);
            requiredsize3abfnks.IconCompatParcelizer = null;
            requiredsize3abfnks.read = null;
            requiredsize3abfnks.MediaSessionCompatResultReceiverWrapper = false;
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).clearInitialAnimations$animation_core();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (((requiredSize3ABfNKs) snapshotStateList.get(i)).read != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Transition) snapshotStateList2.get(i2)).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    public final void onTransitionEnd$animation_core() {
        ((onCreateVirtualViewTranslationRequestsui) this.RatingCompat).write(Long.MIN_VALUE);
        TransitionState transitionState = this.MediaSessionCompatToken;
        if (transitionState instanceof BoxKt) {
            ((BoxKt) transitionState).write(((onShowTranslationui) this.MediaBrowserCompatMediaItem).getValue());
        }
        serializer(0L);
        ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transitionState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.read;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) snapshotStateList.get(i)).onTransitionEnd$animation_core();
        }
    }

    public final void resetAnimationFraction$animation_core(float f) {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) snapshotStateList.get(i);
            requiredsize3abfnks.getClass();
            if (f == -4.0f || f == -5.0f) {
                PaddingKt paddingKt = requiredsize3abfnks.IconCompatParcelizer;
                if (paddingKt != null) {
                    requiredsize3abfnks.IconCompatParcelizer().read(paddingKt.MediaMetadataCompat);
                    requiredsize3abfnks.read = null;
                    requiredsize3abfnks.IconCompatParcelizer = null;
                }
                Object obj = f == -4.0f ? requiredsize3abfnks.IconCompatParcelizer().RatingCompat : requiredsize3abfnks.IconCompatParcelizer().MediaMetadataCompat;
                requiredsize3abfnks.IconCompatParcelizer().read(obj);
                requiredsize3abfnks.IconCompatParcelizer().serializer(obj);
                requiredsize3abfnks.read(obj);
                ((onCreateVirtualViewTranslationRequestsui) requiredsize3abfnks.serializer).write(requiredsize3abfnks.IconCompatParcelizer().serializer());
            } else {
                ((getContentCaptureSessionui) requiredsize3abfnks.RatingCompat).IconCompatParcelizer(f);
            }
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).resetAnimationFraction$animation_core(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x007b  */
    public final void seek(long j, Object obj, Object obj2) {
        ((onCreateVirtualViewTranslationRequestsui) this.RatingCompat).write(Long.MIN_VALUE);
        TransitionState transitionState = this.MediaSessionCompatToken;
        ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transitionState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).setValue(Boolean.FALSE);
        boolean zSerializer = serializer();
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.MediaBrowserCompatMediaItem;
        if (zSerializer) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transitionState.IconCompatParcelizer(), obj}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue(), obj2}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transitionState.IconCompatParcelizer(), obj}, getCieXyz.write())).booleanValue() && (transitionState instanceof BoxKt)) {
                        ((BoxKt) transitionState).write(obj);
                    }
                    ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(obj2);
                    ((onShowTranslationui) this.IconCompatParcelizer).setValue(Boolean.TRUE);
                    ((onShowTranslationui) this.MediaMetadataCompat).setValue(new paddingVpY3zN4default(obj, obj2));
                }
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transitionState.IconCompatParcelizer(), obj}, getCieXyz.write())).booleanValue()) {
                    ((BoxKt) transitionState).write(obj);
                }
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(obj2);
                ((onShowTranslationui) this.IconCompatParcelizer).setValue(Boolean.TRUE);
                ((onShowTranslationui) this.MediaMetadataCompat).setValue(new paddingVpY3zN4default(obj, obj2));
            }
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transitionState.IconCompatParcelizer(), obj}, getCieXyz.write())).booleanValue()) {
                ((BoxKt) transitionState).write(obj);
            }
            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(obj2);
            ((onShowTranslationui) this.IconCompatParcelizer).setValue(Boolean.TRUE);
            ((onShowTranslationui) this.MediaMetadataCompat).setValue(new paddingVpY3zN4default(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.read;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) snapshotStateList.get(i);
            transition.getClass();
            if (transition.serializer()) {
                transition.seek(j, transition.MediaSessionCompatToken.IconCompatParcelizer(), ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.RemoteActionCompatParcelizer;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((requiredSize3ABfNKs) snapshotStateList2.get(i2)).read(j);
        }
        this.MediaSessionCompatQueueItem = j;
    }

    public final boolean serializer() {
        return ((Boolean) this.IconCompatParcelizer.getValue()).booleanValue();
    }

    public final void setInitialAnimations$animation_core(FlowLayoutKt flowLayoutKt) {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) snapshotStateList.get(i);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = requiredsize3abfnks.ParcelableVolumeInfo;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{requiredsize3abfnks.IconCompatParcelizer().MediaMetadataCompat, requiredsize3abfnks.IconCompatParcelizer().RatingCompat}, getCieXyz.write())).booleanValue()) {
                requiredsize3abfnks.IconCompatParcelizer = requiredsize3abfnks.IconCompatParcelizer();
                requiredsize3abfnks.read = flowLayoutKt;
            }
            onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            ((onShowTranslationui) requiredsize3abfnks.write).setValue(new PaddingKt(requiredsize3abfnks.MediaDescriptionCompat, requiredsize3abfnks.PlaybackStateCompat, onshowtranslationui.getValue(), onshowtranslationui.getValue(), requiredsize3abfnks.ComponentActivity.RemoteActionCompatParcelizer()));
            ((onCreateVirtualViewTranslationRequestsui) requiredsize3abfnks.serializer).write(requiredsize3abfnks.IconCompatParcelizer().serializer());
            requiredsize3abfnks.MediaSessionCompatResultReceiverWrapper = true;
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).setInitialAnimations$animation_core(flowLayoutKt);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((requiredSize3ABfNKs) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    public final void updateInitialValues$animation_core() {
        PaddingKt paddingKt;
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) snapshotStateList.get(i);
            FlowLayoutKt flowLayoutKt = requiredsize3abfnks.read;
            if (flowLayoutKt != null && (paddingKt = requiredsize3abfnks.IconCompatParcelizer) != null) {
                long j = MathKt.read(flowLayoutKt.write() * ((double) flowLayoutKt.RemoteActionCompatParcelizer()));
                Object objRemoteActionCompatParcelizer = paddingKt.RemoteActionCompatParcelizer(j);
                if (requiredsize3abfnks.MediaSessionCompatResultReceiverWrapper) {
                    requiredsize3abfnks.IconCompatParcelizer().serializer(objRemoteActionCompatParcelizer);
                }
                requiredsize3abfnks.IconCompatParcelizer().read(objRemoteActionCompatParcelizer);
                ((onCreateVirtualViewTranslationRequestsui) requiredsize3abfnks.serializer).write(requiredsize3abfnks.IconCompatParcelizer().serializer());
                if (requiredsize3abfnks.RemoteActionCompatParcelizer() == -2.0f || requiredsize3abfnks.MediaSessionCompatResultReceiverWrapper) {
                    requiredsize3abfnks.read(objRemoteActionCompatParcelizer);
                } else {
                    requiredsize3abfnks.read(requiredsize3abfnks.PlaybackStateCompatCustomAction.read());
                }
                if (j >= flowLayoutKt.write()) {
                    requiredsize3abfnks.read = null;
                    requiredsize3abfnks.IconCompatParcelizer = null;
                } else {
                    flowLayoutKt.read();
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).updateInitialValues$animation_core();
        }
    }

    public Transition(TransitionState transitionState, Transition transition, String str) {
        this.MediaSessionCompatToken = transitionState;
        this.MediaDescriptionCompat = transition;
        this.write = str;
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(transitionState.IconCompatParcelizer());
        this.MediaMetadataCompat = CompositionKt.RemoteActionCompatParcelizer(new paddingVpY3zN4default(transitionState.IconCompatParcelizer(), transitionState.IconCompatParcelizer()));
        Boolean bool = Boolean.FALSE;
        this.PlaybackStateCompat = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.RemoteActionCompatParcelizer = new SnapshotStateList();
        this.read = new SnapshotStateList();
        this.IconCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.PlaybackStateCompatCustomAction = CompositionKt.serializer(new offsetVpY3zN4default(this, 1));
        transitionState.read(this);
    }

    public final void onFrame$animation_core(long j, boolean z) {
        onCreateVirtualViewTranslationRequestsui oncreatevirtualviewtranslationrequestsui = (onCreateVirtualViewTranslationRequestsui) this.RatingCompat;
        long jRemoteActionCompatParcelizer = oncreatevirtualviewtranslationrequestsui.RemoteActionCompatParcelizer();
        TransitionState transitionState = this.MediaSessionCompatToken;
        if (jRemoteActionCompatParcelizer == Long.MIN_VALUE) {
            oncreatevirtualviewtranslationrequestsui.write(j);
            ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transitionState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transitionState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).getValue()).booleanValue()) {
            ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transitionState.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).setValue(Boolean.TRUE);
        }
        ((onShowTranslationui) this.PlaybackStateCompat).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            requiredSize3ABfNKs requiredsize3abfnks = (requiredSize3ABfNKs) snapshotStateList.get(i);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = requiredsize3abfnks.MediaSessionCompatQueueItem;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = requiredsize3abfnks.MediaSessionCompatQueueItem;
            if (!((Boolean) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()).booleanValue()) {
                long jSerializer = z ? requiredsize3abfnks.IconCompatParcelizer().serializer() : j;
                requiredsize3abfnks.read(requiredsize3abfnks.IconCompatParcelizer().RemoteActionCompatParcelizer(jSerializer));
                requiredsize3abfnks.ComponentActivity = requiredsize3abfnks.IconCompatParcelizer().write(jSerializer);
                if (requiredsize3abfnks.IconCompatParcelizer().IconCompatParcelizer(jSerializer)) {
                    ((onShowTranslationui) populateViewStructure_androidKtpopulate8).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((onShowTranslationui) populateViewStructure_androidKtpopulate8).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition transition = (Transition) snapshotStateList2.get(i2);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = transition.MediaBrowserCompatMediaItem;
            TransitionState transitionState2 = transition.MediaSessionCompatToken;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) populateViewStructure_androidKtpopulate9).getValue(), transitionState2.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                transition.onFrame$animation_core(j, z);
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue(), transitionState2.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                z2 = false;
            }
        }
        if (z2) {
            onTransitionEnd$animation_core();
        }
    }

    public final void seekAnimations$animation_core(long j) {
        onCreateVirtualViewTranslationRequestsui oncreatevirtualviewtranslationrequestsui = (onCreateVirtualViewTranslationRequestsui) this.RatingCompat;
        if (oncreatevirtualviewtranslationrequestsui.RemoteActionCompatParcelizer() == Long.MIN_VALUE) {
            oncreatevirtualviewtranslationrequestsui.write(j);
        }
        serializer(j);
        ((onShowTranslationui) this.PlaybackStateCompat).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((requiredSize3ABfNKs) snapshotStateList.get(i)).read(j);
        }
        SnapshotStateList snapshotStateList2 = this.read;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition transition = (Transition) snapshotStateList2.get(i2);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue(), transition.MediaSessionCompatToken.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                transition.seekAnimations$animation_core(j);
            }
        }
    }

    public final void updateTarget$animation_core(Object obj) {
        onShowTranslationui onshowtranslationui = (onShowTranslationui) this.MediaBrowserCompatMediaItem;
        Object[] objArr = {onshowtranslationui.getValue(), obj};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        ((onShowTranslationui) this.MediaMetadataCompat).setValue(new paddingVpY3zN4default(onshowtranslationui.getValue(), obj));
        TransitionState transitionState = this.MediaSessionCompatToken;
        Object[] objArr2 = {transitionState.IconCompatParcelizer(), onshowtranslationui.getValue()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            transitionState.write(onshowtranslationui.getValue());
        }
        onshowtranslationui.setValue(obj);
        if (((onCreateVirtualViewTranslationRequestsui) this.RatingCompat).RemoteActionCompatParcelizer() == Long.MIN_VALUE) {
            ((onShowTranslationui) this.PlaybackStateCompat).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.RemoteActionCompatParcelizer;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((getContentCaptureSessionui) ((requiredSize3ABfNKs) snapshotStateList.get(i)).RatingCompat).IconCompatParcelizer(-2.0f);
        }
    }

    public final long read() {
        Transition transition = this.MediaDescriptionCompat;
        return transition != null ? transition.read() : ((onCreateVirtualViewTranslationRequestsui) this.serializer).RemoteActionCompatParcelizer();
    }

    public final void serializer(long j) {
        if (this.MediaDescriptionCompat == null) {
            ((onCreateVirtualViewTranslationRequestsui) this.serializer).write(j);
        }
    }

    public final void read(Object obj, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1493585151);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(obj) : getpostalcode.IconCompatParcelizer(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(this) ? 32 : 16;
        }
        int i4 = 0;
        if (!getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (serializer()) {
            getpostalcode.serializer(467722849);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(466062241);
            updateTarget$animation_core(obj);
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.serializer(new offsetVpY3zN4default(this, i4));
                getpostalcode.write(objComponentActivity);
            }
            if (((Boolean) ((onViewAttachedToWindow) objComponentActivity).getValue()).booleanValue()) {
                getpostalcode.serializer(466470356);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                    getpostalcode.write(objComponentActivity2);
                }
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
                boolean z2 = i5 == 32;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | z2) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new Recomposer$$ExternalSyntheticLambda4(getcontentviewgroupparentlayout, i3, this);
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.IconCompatParcelizer(getcontentviewgroupparentlayout, this, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(467712929);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, i4, this, obj);
        }
    }
}
