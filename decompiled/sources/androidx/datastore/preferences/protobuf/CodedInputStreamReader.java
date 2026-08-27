package androidx.datastore.preferences.protobuf;

import androidx.emoji2.text.EmojiProcessor;
import bo.app.af$$ExternalSyntheticOutline1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.charset.Charset;
import java.util.List;
import o.CornerRadiusKt;
import o.CornerRadiusdefault;
import o.OneDimensionalFocusSearchKtWhenMappings;
import o.TwoDimensionalFocusSearchKt;
import o.beamBeats_I7lrPNginSourceBeam;
import o.beamBeats_I7lrPNgisInDirectionOfSearch;
import o.collectAccessibleChildren;
import o.copyOHQCggk;
import o.getEmbeddedViewFocusRect;
import o.getHeight;
import o.getYannotations;
import o.isBetterCandidate_I7lrPNgmajorAxisDistance;
import o.moveFocusInChildren3ESFkO8;
import o.toStringAsFixed;
import o.topLeft;
import o.twoDimensionalFocusSearchsMXa3k8;

/* JADX INFO: loaded from: classes.dex */
public final class CodedInputStreamReader implements CornerRadiusKt {
    public final getEmbeddedViewFocusRect IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int serializer = 0;
    public int write;

    @Override // o.CornerRadiusKt
    public final String ComponentActivity() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(2);
        return this.IconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    @Override // o.CornerRadiusKt
    public final void IconCompatParcelizer(getYannotations getyannotations, EmojiProcessor emojiProcessor, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(2);
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = getembeddedviewfocusrect.RemoteActionCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
        Object obj = emojiProcessor.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = "";
        Object objRemoteActionCompatParcelizer2 = obj;
        while (true) {
            try {
                int iIconCompatParcelizer = IconCompatParcelizer();
                if (iIconCompatParcelizer == Integer.MAX_VALUE || getembeddedviewfocusrect.read()) {
                    break;
                }
                if (iIconCompatParcelizer == 1) {
                    objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((getHeight) emojiProcessor.serializer, (Class) null, (beamBeats_I7lrPNgisInDirectionOfSearch) null);
                } else if (iIconCompatParcelizer != 2) {
                    try {
                        if (!r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((getHeight) emojiProcessor.read, obj.getClass(), beambeats_i7lrpngisindirectionofsearch);
                }
            } catch (Throwable th) {
                getembeddedviewfocusrect.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                throw th;
            }
        }
        getyannotations.put(objRemoteActionCompatParcelizer, objRemoteActionCompatParcelizer2);
        getembeddedviewfocusrect.IconCompatParcelizer(iRemoteActionCompatParcelizer);
    }

    @Override // o.CornerRadiusKt
    public final int MediaBrowserCompatMediaItem() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // o.CornerRadiusKt
    public final float MediaDescriptionCompat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(5);
        return this.IconCompatParcelizer.RatingCompat();
    }

    @Override // o.CornerRadiusKt
    public final int MediaMetadataCompat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem();
    }

    @Override // o.CornerRadiusKt
    public final long MediaSessionCompatQueueItem() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(1);
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // o.CornerRadiusKt
    public final long MediaSessionCompatResultReceiverWrapper() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.ParcelableVolumeInfo();
    }

    @Override // o.CornerRadiusKt
    public final void MediaSessionCompatResultReceiverWrapper(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        IconCompatParcelizer(list, false);
    }

    @Override // o.CornerRadiusKt
    public final long MediaSessionCompatToken() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(1);
        return this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.CornerRadiusKt
    public final int ParcelableVolumeInfo() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(5);
        return this.IconCompatParcelizer.PlaybackStateCompat();
    }

    @Override // o.CornerRadiusKt
    public final long PlaybackStateCompat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.PlaybackStateCompatCustomAction();
    }

    @Override // o.CornerRadiusKt
    public final void PlaybackStateCompat(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        IconCompatParcelizer(list, true);
    }

    @Override // o.CornerRadiusKt
    public final int PlaybackStateCompatCustomAction() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.MediaSessionCompatToken();
    }

    @Override // o.CornerRadiusKt
    public final int RatingCompat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(5);
        return this.IconCompatParcelizer.MediaMetadataCompat();
    }

    @Override // o.CornerRadiusKt
    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.CornerRadiusKt
    public final long ResultReceiver() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    @Override // o.CornerRadiusKt
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.ComponentActivity();
    }

    @Override // o.CornerRadiusKt
    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(2);
        return this.IconCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
    }

    @Override // o.CornerRadiusKt
    public final Object read(toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(2);
        return IconCompatParcelizer(tostringasfixed, beambeats_i7lrpngisindirectionofsearch);
    }

    @Override // o.CornerRadiusKt
    public final moveFocusInChildren3ESFkO8 read() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(2);
        return this.IconCompatParcelizer.serializer();
    }

    @Override // o.CornerRadiusKt
    public final double serializer() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(1);
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.CornerRadiusKt
    public final Object write(toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(3);
        return serializer(tostringasfixed, beambeats_i7lrpngisindirectionofsearch);
    }

    @Override // o.CornerRadiusKt
    public final boolean write() throws InvalidProtocolBufferException.InvalidWireTypeException {
        serializer(0);
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final Object IconCompatParcelizer(toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException {
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
        if (getembeddedviewfocusrect.read >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iRemoteActionCompatParcelizer = getembeddedviewfocusrect.RemoteActionCompatParcelizer(iComponentActivity);
        Object obj = tostringasfixed.read();
        getembeddedviewfocusrect.read++;
        tostringasfixed.write(obj, this, beambeats_i7lrpngisindirectionofsearch);
        tostringasfixed.IconCompatParcelizer(obj);
        getembeddedviewfocusrect.write(0);
        getembeddedviewfocusrect.read--;
        getembeddedviewfocusrect.IconCompatParcelizer(iRemoteActionCompatParcelizer);
        return obj;
    }

    public final Object RemoteActionCompatParcelizer(getHeight getheight, Class cls, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (TwoDimensionalFocusSearchKt.serializer[getheight.ordinal()]) {
            case 1:
                return Boolean.valueOf(write());
            case 2:
                return read();
            case 3:
                return Double.valueOf(serializer());
            case 4:
                return Integer.valueOf(MediaBrowserCompatMediaItem());
            case 5:
                return Integer.valueOf(RatingCompat());
            case 6:
                return Long.valueOf(MediaSessionCompatQueueItem());
            case 7:
                return Float.valueOf(MediaDescriptionCompat());
            case 8:
                return Integer.valueOf(MediaMetadataCompat());
            case 9:
                return Long.valueOf(MediaSessionCompatResultReceiverWrapper());
            case 10:
                serializer(2);
                return IconCompatParcelizer(CornerRadiusdefault.write.RemoteActionCompatParcelizer(cls), beambeats_i7lrpngisindirectionofsearch);
            case 11:
                return Integer.valueOf(ParcelableVolumeInfo());
            case 12:
                return Long.valueOf(MediaSessionCompatToken());
            case 13:
                return Integer.valueOf(PlaybackStateCompatCustomAction());
            case 14:
                return Long.valueOf(PlaybackStateCompat());
            case 15:
                return r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            case 16:
                return Integer.valueOf(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 17:
                return Long.valueOf(ResultReceiver());
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("unsupported field type.");
                return null;
        }
    }

    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (getembeddedviewfocusrect.read() || (i = this.write) == this.RemoteActionCompatParcelizer) {
            return false;
        }
        return getembeddedviewfocusrect.read(i);
    }

    public final void read(int i) throws InvalidProtocolBufferException {
        if (this.IconCompatParcelizer.write() != i) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
    }

    public final Object serializer(toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = ((this.write >>> 3) << 3) | 4;
        try {
            Object obj = tostringasfixed.read();
            tostringasfixed.write(obj, this, beambeats_i7lrpngisindirectionofsearch);
            tostringasfixed.IconCompatParcelizer(obj);
            if (this.write != this.RemoteActionCompatParcelizer) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer = i;
            return obj;
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer = i;
            throw th;
        }
    }

    @Override // o.CornerRadiusKt
    public final void ComponentActivity(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.ComponentActivity();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.ComponentActivity();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.ComponentActivity()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.ComponentActivity()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void IconCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.MediaDescriptionCompat();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.MediaDescriptionCompat();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.MediaDescriptionCompat()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.MediaDescriptionCompat()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void MediaBrowserCompatMediaItem(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.MediaSessionCompatQueueItem();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.MediaSessionCompatQueueItem();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.MediaSessionCompatQueueItem()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.MediaSessionCompatQueueItem()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void MediaSessionCompatQueueItem(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof copyOHQCggk;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.ParcelableVolumeInfo();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.ParcelableVolumeInfo();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(getembeddedviewfocusrect.ParcelableVolumeInfo()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Long.valueOf(getembeddedviewfocusrect.ParcelableVolumeInfo()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void ParcelableVolumeInfo(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof copyOHQCggk;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.PlaybackStateCompatCustomAction();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.PlaybackStateCompatCustomAction();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(getembeddedviewfocusrect.PlaybackStateCompatCustomAction()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Long.valueOf(getembeddedviewfocusrect.PlaybackStateCompatCustomAction()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void PlaybackStateCompatCustomAction(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.MediaSessionCompatToken();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.MediaSessionCompatToken();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.MediaSessionCompatToken()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.MediaSessionCompatToken()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof copyOHQCggk;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(getembeddedviewfocusrect.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Long.valueOf(getembeddedviewfocusrect.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    @Override // o.CornerRadiusKt
    public final void read(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof OneDimensionalFocusSearchKtWhenMappings;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 0) {
                getembeddedviewfocusrect.RemoteActionCompatParcelizer();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.ComponentActivity();
            getembeddedviewfocusrect.RemoteActionCompatParcelizer();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(getembeddedviewfocusrect.RemoteActionCompatParcelizer()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iWrite = getembeddedviewfocusrect.write() + getembeddedviewfocusrect.ComponentActivity();
        do {
            list.add(Boolean.valueOf(getembeddedviewfocusrect.RemoteActionCompatParcelizer()));
        } while (getembeddedviewfocusrect.write() < iWrite);
        read(iWrite);
    }

    public CodedInputStreamReader(getEmbeddedViewFocusRect getembeddedviewfocusrect) {
        Charset charset = topLeft.serializer;
        this.IconCompatParcelizer = getembeddedviewfocusrect;
        getembeddedviewfocusrect.IconCompatParcelizer = this;
    }

    @Override // o.CornerRadiusKt
    public final int IconCompatParcelizer() {
        int i = this.serializer;
        if (i != 0) {
            this.write = i;
            this.serializer = 0;
        } else {
            this.write = this.IconCompatParcelizer.ResultReceiver();
        }
        int i2 = this.write;
        if (i2 == 0 || i2 == this.RemoteActionCompatParcelizer) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // o.CornerRadiusKt
    public final void MediaDescriptionCompat(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof collectAccessibleChildren;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 2) {
                IconCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
                getembeddedviewfocusrect.RatingCompat();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.RatingCompat();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 2) {
            int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
            IconCompatParcelizer(iComponentActivity);
            int iWrite = getembeddedviewfocusrect.write();
            do {
                list.add(Float.valueOf(getembeddedviewfocusrect.RatingCompat()));
            } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(Float.valueOf(getembeddedviewfocusrect.RatingCompat()));
            if (getembeddedviewfocusrect.read()) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == this.write);
        this.serializer = iResultReceiver;
    }

    @Override // o.CornerRadiusKt
    public final void MediaMetadataCompat(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 2) {
                IconCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
                getembeddedviewfocusrect.PlaybackStateCompat();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.PlaybackStateCompat();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 2) {
            int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
            IconCompatParcelizer(iComponentActivity);
            int iWrite = getembeddedviewfocusrect.write();
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.PlaybackStateCompat()));
            } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.PlaybackStateCompat()));
            if (getembeddedviewfocusrect.read()) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == this.write);
        this.serializer = iResultReceiver;
    }

    @Override // o.CornerRadiusKt
    public final void MediaSessionCompatToken(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof copyOHQCggk;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 1) {
                getembeddedviewfocusrect.MediaSessionCompatResultReceiverWrapper();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            RemoteActionCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
            getembeddedviewfocusrect.MediaSessionCompatResultReceiverWrapper();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(getembeddedviewfocusrect.MediaSessionCompatResultReceiverWrapper()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
        RemoteActionCompatParcelizer(iComponentActivity);
        int iWrite = getembeddedviewfocusrect.write();
        do {
            list.add(Long.valueOf(getembeddedviewfocusrect.MediaSessionCompatResultReceiverWrapper()));
        } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
    }

    @Override // o.CornerRadiusKt
    public final void RatingCompat(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof copyOHQCggk;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 1) {
                getembeddedviewfocusrect.MediaBrowserCompatMediaItem();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            RemoteActionCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
            getembeddedviewfocusrect.MediaBrowserCompatMediaItem();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(getembeddedviewfocusrect.MediaBrowserCompatMediaItem()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
        RemoteActionCompatParcelizer(iComponentActivity);
        int iWrite = getembeddedviewfocusrect.write();
        do {
            list.add(Long.valueOf(getembeddedviewfocusrect.MediaBrowserCompatMediaItem()));
        } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
    }

    @Override // o.CornerRadiusKt
    public final void serializer(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof beamBeats_I7lrPNginSourceBeam;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 1) {
                getembeddedviewfocusrect.IconCompatParcelizer();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            RemoteActionCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
            getembeddedviewfocusrect.IconCompatParcelizer();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(getembeddedviewfocusrect.IconCompatParcelizer()));
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
        RemoteActionCompatParcelizer(iComponentActivity);
        int iWrite = getembeddedviewfocusrect.write();
        do {
            list.add(Double.valueOf(getembeddedviewfocusrect.IconCompatParcelizer()));
        } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
    }

    @Override // o.CornerRadiusKt
    public final void write(List list) throws InvalidProtocolBufferException {
        int iResultReceiver;
        boolean z = list instanceof isBetterCandidate_I7lrPNgmajorAxisDistance;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (z) {
            af$$ExternalSyntheticOutline1.m(list);
            int i = this.write & 7;
            if (i == 2) {
                IconCompatParcelizer(getembeddedviewfocusrect.ComponentActivity());
                getembeddedviewfocusrect.MediaMetadataCompat();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            getembeddedviewfocusrect.MediaMetadataCompat();
            throw null;
        }
        int i2 = this.write & 7;
        if (i2 == 2) {
            int iComponentActivity = getembeddedviewfocusrect.ComponentActivity();
            IconCompatParcelizer(iComponentActivity);
            int iWrite = getembeddedviewfocusrect.write();
            do {
                list.add(Integer.valueOf(getembeddedviewfocusrect.MediaMetadataCompat()));
            } while (getembeddedviewfocusrect.write() < iWrite + iComponentActivity);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(Integer.valueOf(getembeddedviewfocusrect.MediaMetadataCompat()));
            if (getembeddedviewfocusrect.read()) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == this.write);
        this.serializer = iResultReceiver;
    }

    public static void IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
    }

    public static void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
    }

    @Override // o.CornerRadiusKt
    public final void IconCompatParcelizer(List list, toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iResultReceiver;
        int i = this.write;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(IconCompatParcelizer(tostringasfixed, beambeats_i7lrpngisindirectionofsearch));
            getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
            if (getembeddedviewfocusrect.read() || this.serializer != 0) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == i);
        this.serializer = iResultReceiver;
    }

    public final void IconCompatParcelizer(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iResultReceiver;
        int iResultReceiver2;
        if ((this.write & 7) != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        boolean z2 = list instanceof twoDimensionalFocusSearchsMXa3k8;
        getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
        if (!z2 || z) {
            do {
                list.add(z ? r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() : ComponentActivity());
                if (getembeddedviewfocusrect.read()) {
                    return;
                } else {
                    iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
                }
            } while (iResultReceiver == this.write);
            this.serializer = iResultReceiver;
            return;
        }
        twoDimensionalFocusSearchsMXa3k8 twodimensionalfocussearchsmxa3k8 = (twoDimensionalFocusSearchsMXa3k8) list;
        do {
            twodimensionalfocussearchsmxa3k8.write(read());
            if (getembeddedviewfocusrect.read()) {
                return;
            } else {
                iResultReceiver2 = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver2 == this.write);
        this.serializer = iResultReceiver2;
    }

    @Override // o.CornerRadiusKt
    public final void RemoteActionCompatParcelizer(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iResultReceiver;
        if ((this.write & 7) != 2) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(read());
            getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
            if (getembeddedviewfocusrect.read()) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == this.write);
        this.serializer = iResultReceiver;
    }

    @Override // o.CornerRadiusKt
    public final void RemoteActionCompatParcelizer(List list, toStringAsFixed tostringasfixed, beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iResultReceiver;
        int i = this.write;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
        do {
            list.add(serializer(tostringasfixed, beambeats_i7lrpngisindirectionofsearch));
            getEmbeddedViewFocusRect getembeddedviewfocusrect = this.IconCompatParcelizer;
            if (getembeddedviewfocusrect.read() || this.serializer != 0) {
                return;
            } else {
                iResultReceiver = getembeddedviewfocusrect.ResultReceiver();
            }
        } while (iResultReceiver == i);
        this.serializer = iResultReceiver;
    }

    public final void serializer(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.write & 7) != i) {
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }
    }
}
