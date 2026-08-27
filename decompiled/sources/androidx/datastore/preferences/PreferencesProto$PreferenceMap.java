package androidx.datastore.preferences;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.protobuf.CodedInputStreamReader;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import o.CornerRadiusCompanion;
import o.CornerRadiusdefault;
import o.OneDimensionalFocusSearchKt;
import o.beamBeats_I7lrPNgisInDirectionOfSearch;
import o.getAlignmentLinesMap;
import o.getAlwaysLCbbffg;
import o.getCenterRightF1C5BW0;
import o.getEmbeddedViewFocusRect;
import o.getYannotations;
import o.isBetterCandidateI7lrPNg;
import o.isBetterCandidate_I7lrPNgisCandidate;
import o.isBetterCandidate_I7lrPNgminorAxisDistance;
import o.isBetterCandidate_I7lrPNgweightedDistance;
import o.lerp3Ry4LBc;
import o.moveFocusInChildren3ESFkO8;
import o.pathFromRoot;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.toStringAsFixed;
import o.topLeft;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$PreferenceMap extends isBetterCandidate_I7lrPNgminorAxisDistance {
    private static final PreferencesProto$PreferenceMap DEFAULT_INSTANCE;
    private static volatile CornerRadiusCompanion PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private getYannotations preferences_ = getYannotations.IconCompatParcelizer;

    static {
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = new PreferencesProto$PreferenceMap();
        DEFAULT_INSTANCE = preferencesProto$PreferenceMap;
        isBetterCandidate_I7lrPNgminorAxisDistance.IconCompatParcelizer(PreferencesProto$PreferenceMap.class, preferencesProto$PreferenceMap);
    }

    public static getYannotations IconCompatParcelizer(PreferencesProto$PreferenceMap preferencesProto$PreferenceMap) {
        getYannotations getyannotations = preferencesProto$PreferenceMap.preferences_;
        if (!getyannotations.write) {
            preferencesProto$PreferenceMap.preferences_ = getyannotations.read();
        }
        return preferencesProto$PreferenceMap.preferences_;
    }

    public static OneDimensionalFocusSearchKt write() {
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = DEFAULT_INSTANCE;
        preferencesProto$PreferenceMap.getClass();
        return (OneDimensionalFocusSearchKt) ((isBetterCandidate_I7lrPNgisCandidate) preferencesProto$PreferenceMap.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_BUILDER));
    }

    @Override // o.isBetterCandidate_I7lrPNgminorAxisDistance
    public final Object IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance isbettercandidate_i7lrpngweighteddistance) {
        CornerRadiusCompanion isbettercandidatei7lrpng;
        switch (getAlwaysLCbbffg.write[isbettercandidate_i7lrpngweighteddistance.ordinal()]) {
            case 1:
                return new PreferencesProto$PreferenceMap();
            case 2:
                return new OneDimensionalFocusSearchKt(DEFAULT_INSTANCE);
            case 3:
                return new lerp3Ry4LBc(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", pathFromRoot.RemoteActionCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                CornerRadiusCompanion cornerRadiusCompanion = PARSER;
                if (cornerRadiusCompanion != null) {
                    return cornerRadiusCompanion;
                }
                synchronized (PreferencesProto$PreferenceMap.class) {
                    isbettercandidatei7lrpng = PARSER;
                    if (isbettercandidatei7lrpng == null) {
                        isbettercandidatei7lrpng = new isBetterCandidateI7lrPNg();
                        PARSER = isbettercandidatei7lrpng;
                    }
                    break;
                }
                return isbettercandidatei7lrpng;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public final Map RemoteActionCompatParcelizer() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public static PreferencesProto$PreferenceMap serializer(final InputStream inputStream) {
        getEmbeddedViewFocusRect getembeddedviewfocusrect;
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = DEFAULT_INSTANCE;
        if (inputStream == null) {
            final byte[] bArr = topLeft.read;
            final int length = bArr.length;
            getembeddedviewfocusrect = new getEmbeddedViewFocusRect(bArr, length) { // from class: androidx.datastore.preferences.protobuf.CodedInputStream$ArrayDecoder
                public int MediaBrowserCompatMediaItem;
                public int RatingCompat;
                public int serializer;
                public final byte[] write;
                public int RemoteActionCompatParcelizer = Integer.MAX_VALUE;
                public int MediaDescriptionCompat = 0;

                @Override // o.getEmbeddedViewFocusRect
                public final int ComponentActivity() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long MediaBrowserCompatMediaItem() {
                    return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaDescriptionCompat() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaMetadataCompat() {
                    return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaSessionCompatQueueItem() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long MediaSessionCompatResultReceiverWrapper() {
                    return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaSessionCompatToken() {
                    int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    return (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg >>> 1) ^ (-(iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg & 1));
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long ParcelableVolumeInfo() {
                    return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int PlaybackStateCompat() {
                    return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long PlaybackStateCompatCustomAction() {
                    long jR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                    return (jR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 >>> 1) ^ (-(1 & jR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean RemoteActionCompatParcelizer() {
                    return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() != 0;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
                    return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int write() {
                    return this.MediaDescriptionCompat;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final void IconCompatParcelizer(int i) {
                    this.RemoteActionCompatParcelizer = i;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
                    if (i < 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    int i2 = this.MediaDescriptionCompat + i;
                    int i3 = this.RemoteActionCompatParcelizer;
                    if (i2 > i3) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.RemoteActionCompatParcelizer = i2;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
                    return i3;
                }

                public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws InvalidProtocolBufferException {
                    int i = this.MediaDescriptionCompat;
                    if (this.MediaBrowserCompatMediaItem - i < 4) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.MediaDescriptionCompat = i + 4;
                    byte[] bArr2 = this.write;
                    return ((bArr2[i + 3] & 255) << 24) | (bArr2[i] & 255) | ((bArr2[i + 1] & 255) << 8) | ((bArr2[i + 2] & 255) << 16);
                }

                public final int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
                    int i;
                    int i2 = this.MediaDescriptionCompat;
                    int i3 = this.MediaBrowserCompatMediaItem;
                    if (i3 != i2) {
                        int i4 = i2 + 1;
                        byte[] bArr2 = this.write;
                        byte b = bArr2[i2];
                        if (b >= 0) {
                            this.MediaDescriptionCompat = i4;
                            return b;
                        }
                        if (i3 - i4 >= 9) {
                            int i5 = i2 + 2;
                            int i6 = (bArr2[i4] << 7) ^ b;
                            if (i6 < 0) {
                                i = i6 ^ (-128);
                            } else {
                                int i7 = i2 + 3;
                                int i8 = (bArr2[i5] << 14) ^ i6;
                                if (i8 >= 0) {
                                    i = i8 ^ 16256;
                                } else {
                                    int i9 = i2 + 4;
                                    int i10 = i8 ^ (bArr2[i7] << 21);
                                    if (i10 < 0) {
                                        i = (-2080896) ^ i10;
                                    } else {
                                        i7 = i2 + 5;
                                        byte b2 = bArr2[i9];
                                        int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                        if (b2 < 0) {
                                            i9 = i2 + 6;
                                            if (bArr2[i7] < 0) {
                                                i7 = i2 + 7;
                                                if (bArr2[i9] < 0) {
                                                    i9 = i2 + 8;
                                                    if (bArr2[i7] < 0) {
                                                        i7 = i2 + 9;
                                                        if (bArr2[i9] < 0) {
                                                            if (bArr2[i7] >= 0) {
                                                                i5 = i2 + 10;
                                                                i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i = i11;
                                        }
                                        i = i11;
                                    }
                                    i5 = i9;
                                }
                                i5 = i7;
                            }
                            this.MediaDescriptionCompat = i5;
                            return i;
                        }
                    }
                    return (int) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }

                public final long r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
                    int i = this.MediaDescriptionCompat;
                    int i2 = this.MediaBrowserCompatMediaItem;
                    if (i2 != i) {
                        int i3 = i + 1;
                        byte[] bArr2 = this.write;
                        byte b = bArr2[i];
                        if (b >= 0) {
                            this.MediaDescriptionCompat = i3;
                            return b;
                        }
                        if (i2 - i3 >= 9) {
                            int i4 = i + 2;
                            int i5 = (bArr2[i3] << 7) ^ b;
                            if (i5 < 0) {
                                j = i5 ^ (-128);
                            } else {
                                int i6 = i + 3;
                                int i7 = (bArr2[i4] << 14) ^ i5;
                                if (i7 >= 0) {
                                    j = i7 ^ 16256;
                                    i4 = i6;
                                } else {
                                    int i8 = i + 4;
                                    int i9 = i7 ^ (bArr2[i6] << 21);
                                    if (i9 < 0) {
                                        j4 = (-2080896) ^ i9;
                                    } else {
                                        long j5 = i9;
                                        i4 = i + 5;
                                        long j6 = j5 ^ (((long) bArr2[i8]) << 28);
                                        if (j6 >= 0) {
                                            j3 = 266354560;
                                        } else {
                                            i8 = i + 6;
                                            long j7 = j6 ^ (((long) bArr2[i4]) << 35);
                                            if (j7 < 0) {
                                                j2 = -34093383808L;
                                            } else {
                                                i4 = i + 7;
                                                j6 = j7 ^ (((long) bArr2[i8]) << 42);
                                                if (j6 >= 0) {
                                                    j3 = 4363953127296L;
                                                } else {
                                                    i8 = i + 8;
                                                    j7 = j6 ^ (((long) bArr2[i4]) << 49);
                                                    if (j7 < 0) {
                                                        j2 = -558586000294016L;
                                                    } else {
                                                        i4 = i + 9;
                                                        long j8 = (j7 ^ (((long) bArr2[i8]) << 56)) ^ 71499008037633920L;
                                                        if (j8 < 0) {
                                                            if (bArr2[i4] >= 0) {
                                                                i4 = i + 10;
                                                            }
                                                        }
                                                        j = j8;
                                                    }
                                                }
                                            }
                                            j4 = j2 ^ j7;
                                        }
                                        j = j3 ^ j6;
                                    }
                                    i4 = i8;
                                    j = j4;
                                }
                            }
                            this.MediaDescriptionCompat = i4;
                            return j;
                        }
                    }
                    return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }

                public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() throws InvalidProtocolBufferException {
                    int i = this.MediaDescriptionCompat;
                    if (this.MediaBrowserCompatMediaItem - i < 8) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.MediaDescriptionCompat = i + 8;
                    byte[] bArr2 = this.write;
                    long j = bArr2[i];
                    return ((((long) bArr2[i + 7]) & 255) << 56) | (j & 255) | ((bArr2[i + 1] & 255) << 8) | ((bArr2[i + 2] & 255) << 16) | ((bArr2[i + 3] & 255) << 24) | ((bArr2[i + 4] & 255) << 32) | ((bArr2[i + 5] & 255) << 40) | ((bArr2[i + 6] & 255) << 48);
                }

                public final void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
                    int i = this.MediaBrowserCompatMediaItem + this.serializer;
                    this.MediaBrowserCompatMediaItem = i;
                    int i2 = this.RemoteActionCompatParcelizer;
                    if (i <= i2) {
                        this.serializer = 0;
                        return;
                    }
                    int i3 = i - i2;
                    this.serializer = i3;
                    this.MediaBrowserCompatMediaItem = i - i3;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean read() {
                    return this.MediaDescriptionCompat == this.MediaBrowserCompatMediaItem;
                }

                public final void serializer(int i) throws InvalidProtocolBufferException {
                    if (i >= 0) {
                        int i2 = this.MediaBrowserCompatMediaItem;
                        int i3 = this.MediaDescriptionCompat;
                        if (i <= i2 - i3) {
                            this.MediaDescriptionCompat = i3 + i;
                            return;
                        }
                    }
                    if (i >= 0) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    throw InvalidProtocolBufferException.write();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final double IconCompatParcelizer() {
                    return Double.longBitsToDouble(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                }

                @Override // o.getEmbeddedViewFocusRect
                public final float RatingCompat() {
                    return Float.intBitsToFloat(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                }

                /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:17:0x0033  */
                /* JADX WARN: Code duplicated, block: B:20:0x003d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0042  */
                @Override // o.getEmbeddedViewFocusRect
                public final moveFocusInChildren3ESFkO8 serializer() throws InvalidProtocolBufferException {
                    byte[] bArrCopyOfRange;
                    int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    byte[] bArr2 = this.write;
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0) {
                        int i = this.MediaBrowserCompatMediaItem;
                        int i2 = this.MediaDescriptionCompat;
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= i - i2) {
                            moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = moveFocusInChildren3ESFkO8.read(bArr2, i2, iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                            this.MediaDescriptionCompat += iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            return movefocusinchildren3esfko8;
                        }
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                        return moveFocusInChildren3ESFkO8.IconCompatParcelizer;
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0) {
                        int i3 = this.MediaBrowserCompatMediaItem;
                        int i4 = this.MediaDescriptionCompat;
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= i3 - i4) {
                            int i5 = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + i4;
                            this.MediaDescriptionCompat = i5;
                            bArrCopyOfRange = Arrays.copyOfRange(bArr2, i4, i5);
                        } else {
                            if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= 0) {
                                throw InvalidProtocolBufferException.MediaDescriptionCompat();
                            }
                            if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                                throw InvalidProtocolBufferException.write();
                            }
                            bArrCopyOfRange = topLeft.read;
                        }
                    } else {
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= 0) {
                            throw InvalidProtocolBufferException.MediaDescriptionCompat();
                        }
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                            throw InvalidProtocolBufferException.write();
                        }
                        bArrCopyOfRange = topLeft.read;
                    }
                    moveFocusInChildren3ESFkO8 movefocusinchildren3esfko9 = moveFocusInChildren3ESFkO8.IconCompatParcelizer;
                    return new moveFocusInChildren3ESFkO8(bArrCopyOfRange);
                }

                {
                    this.write = bArr;
                    this.MediaBrowserCompatMediaItem = length;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws InvalidProtocolBufferException {
                    int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0) {
                        int i = this.MediaBrowserCompatMediaItem;
                        int i2 = this.MediaDescriptionCompat;
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= i - i2) {
                            String str = new String(this.write, i2, iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, topLeft.serializer);
                            this.MediaDescriptionCompat += iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            return str;
                        }
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                        return "";
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg < 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    throw InvalidProtocolBufferException.MediaDescriptionCompat();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws InvalidProtocolBufferException {
                    int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0) {
                        int i = this.MediaBrowserCompatMediaItem;
                        int i2 = this.MediaDescriptionCompat;
                        if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= i - i2) {
                            String strWrite = getCenterRightF1C5BW0.read.write(this.write, i2, iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                            this.MediaDescriptionCompat += iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            return strWrite;
                        }
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                        return "";
                    }
                    if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg <= 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    throw InvalidProtocolBufferException.MediaDescriptionCompat();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int ResultReceiver() throws InvalidProtocolBufferException {
                    if (read()) {
                        this.RatingCompat = 0;
                        return 0;
                    }
                    int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    this.RatingCompat = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if ((iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg >>> 3) != 0) {
                        return iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    }
                    throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
                }

                public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() throws InvalidProtocolBufferException {
                    long j = 0;
                    for (int i = 0; i < 64; i += 7) {
                        int i2 = this.MediaDescriptionCompat;
                        if (i2 != this.MediaBrowserCompatMediaItem) {
                            this.MediaDescriptionCompat = i2 + 1;
                            byte b = this.write[i2];
                            j |= ((long) (b & 127)) << i;
                            if ((b & 128) == 0) {
                                return j;
                            }
                        } else {
                            throw InvalidProtocolBufferException.MediaDescriptionCompat();
                        }
                    }
                    throw InvalidProtocolBufferException.serializer();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final void write(int i) throws InvalidProtocolBufferException {
                    if (this.RatingCompat != i) {
                        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean read(int i) throws InvalidProtocolBufferException {
                    int iResultReceiver;
                    int i2 = i & 7;
                    int i3 = 0;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            serializer(8);
                            return true;
                        }
                        if (i2 == 2) {
                            serializer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
                            return true;
                        }
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return false;
                            }
                            if (i2 == 5) {
                                serializer(4);
                                return true;
                            }
                            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                        }
                        do {
                            iResultReceiver = ResultReceiver();
                            if (iResultReceiver == 0) {
                                break;
                            }
                        } while (read(iResultReceiver));
                        write(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    int i4 = this.MediaBrowserCompatMediaItem;
                    int i5 = this.MediaDescriptionCompat;
                    byte[] bArr2 = this.write;
                    if (i4 - i5 >= 10) {
                        while (i3 < 10) {
                            int i6 = this.MediaDescriptionCompat;
                            this.MediaDescriptionCompat = i6 + 1;
                            if (bArr2[i6] < 0) {
                                i3++;
                            }
                        }
                        throw InvalidProtocolBufferException.serializer();
                    }
                    while (i3 < 10) {
                        int i7 = this.MediaDescriptionCompat;
                        if (i7 != this.MediaBrowserCompatMediaItem) {
                            this.MediaDescriptionCompat = i7 + 1;
                            if (bArr2[i7] < 0) {
                                i3++;
                            }
                        } else {
                            throw InvalidProtocolBufferException.MediaDescriptionCompat();
                        }
                    }
                    throw InvalidProtocolBufferException.serializer();
                    return true;
                }
            };
            try {
                getembeddedviewfocusrect.RemoteActionCompatParcelizer(length);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            getembeddedviewfocusrect = new getEmbeddedViewFocusRect(inputStream) { // from class: androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder
                public int MediaBrowserCompatMediaItem = Integer.MAX_VALUE;
                public final InputStream MediaDescriptionCompat;
                public int MediaMetadataCompat;
                public int MediaSessionCompatQueueItem;
                public int RatingCompat;
                public int RemoteActionCompatParcelizer;
                public int serializer;
                public final byte[] write;

                @Override // o.getEmbeddedViewFocusRect
                public final int ComponentActivity() {
                    return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long MediaBrowserCompatMediaItem() {
                    return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaDescriptionCompat() {
                    return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaMetadataCompat() {
                    return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaSessionCompatQueueItem() {
                    return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long MediaSessionCompatResultReceiverWrapper() {
                    return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int MediaSessionCompatToken() {
                    int iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                    return (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 >>> 1) ^ (-(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 & 1));
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long ParcelableVolumeInfo() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int PlaybackStateCompat() {
                    return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long PlaybackStateCompatCustomAction() {
                    long jR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    return (jR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg >>> 1) ^ (-(1 & jR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg));
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean RemoteActionCompatParcelizer() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() != 0;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }

                @Override // o.getEmbeddedViewFocusRect
                public final void IconCompatParcelizer(int i) {
                    this.MediaBrowserCompatMediaItem = i;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                }

                public final ArrayList MediaDescriptionCompat(int i) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    while (i > 0) {
                        int iMin = Math.min(i, Fields.TransformOrigin);
                        byte[] bArr2 = new byte[iMin];
                        int i2 = 0;
                        while (i2 < iMin) {
                            int i3 = this.MediaDescriptionCompat.read(bArr2, i2, iMin - i2);
                            if (i3 == -1) {
                                throw InvalidProtocolBufferException.MediaDescriptionCompat();
                            }
                            this.RatingCompat += i3;
                            i2 += i3;
                        }
                        i -= iMin;
                        arrayList.add(bArr2);
                    }
                    return arrayList;
                }

                public final byte[] MediaMetadataCompat(int i) throws IOException {
                    if (i == 0) {
                        return topLeft.read;
                    }
                    if (i < 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    int i2 = this.RatingCompat;
                    int i3 = this.MediaMetadataCompat;
                    int i4 = i2 + i3 + i;
                    if (i4 - Integer.MAX_VALUE > 0) {
                        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                    int i5 = this.MediaBrowserCompatMediaItem;
                    if (i4 > i5) {
                        RatingCompat((i5 - i2) - i3);
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    int i6 = this.RemoteActionCompatParcelizer - i3;
                    int i7 = i - i6;
                    InputStream inputStream2 = this.MediaDescriptionCompat;
                    if (i7 >= 4096 && i7 > inputStream2.available()) {
                        return null;
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(this.write, this.MediaMetadataCompat, bArr2, 0, i6);
                    this.RatingCompat += this.RemoteActionCompatParcelizer;
                    this.MediaMetadataCompat = 0;
                    this.RemoteActionCompatParcelizer = 0;
                    while (i6 < i) {
                        int i8 = inputStream2.read(bArr2, i6, i - i6);
                        if (i8 == -1) {
                            throw InvalidProtocolBufferException.MediaDescriptionCompat();
                        }
                        this.RatingCompat += i8;
                        i6 += i8;
                    }
                    return bArr2;
                }

                public final void RatingCompat(int i) throws InvalidProtocolBufferException {
                    int i2 = this.RemoteActionCompatParcelizer;
                    int i3 = this.MediaMetadataCompat;
                    int i4 = i2 - i3;
                    if (i <= i4 && i >= 0) {
                        this.MediaMetadataCompat = i3 + i;
                        return;
                    }
                    InputStream inputStream2 = this.MediaDescriptionCompat;
                    if (i < 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    int i5 = this.RatingCompat;
                    int i6 = i5 + i3;
                    int i7 = this.MediaBrowserCompatMediaItem;
                    if (i6 + i > i7) {
                        RatingCompat((i7 - i5) - i3);
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.RatingCompat = i6;
                    this.RemoteActionCompatParcelizer = 0;
                    this.MediaMetadataCompat = 0;
                    while (i4 < i) {
                        long j = i - i4;
                        try {
                            long jSkip = inputStream2.skip(j);
                            if (jSkip < 0 || jSkip > j) {
                                throw new IllegalStateException(inputStream2.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                            }
                            if (jSkip == 0) {
                                break;
                            } else {
                                i4 += (int) jSkip;
                            }
                        } finally {
                            this.RatingCompat += i4;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                        }
                    }
                    if (i4 >= i) {
                        return;
                    }
                    int i8 = this.RemoteActionCompatParcelizer;
                    int i9 = i8 - this.MediaMetadataCompat;
                    this.MediaMetadataCompat = i8;
                    MediaSessionCompatQueueItem(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.RemoteActionCompatParcelizer;
                        if (i10 <= i11) {
                            this.MediaMetadataCompat = i10;
                            return;
                        } else {
                            i9 += i11;
                            this.MediaMetadataCompat = i11;
                            MediaSessionCompatQueueItem(1);
                        }
                    }
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
                    if (i < 0) {
                        throw InvalidProtocolBufferException.write();
                    }
                    int i2 = this.RatingCompat + this.MediaMetadataCompat + i;
                    int i3 = this.MediaBrowserCompatMediaItem;
                    if (i2 > i3) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.MediaBrowserCompatMediaItem = i2;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                    return i3;
                }

                public final long r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws InvalidProtocolBufferException {
                    int i = this.MediaMetadataCompat;
                    if (this.RemoteActionCompatParcelizer - i < 8) {
                        MediaSessionCompatQueueItem(8);
                        i = this.MediaMetadataCompat;
                    }
                    this.MediaMetadataCompat = i + 8;
                    byte[] bArr2 = this.write;
                    long j = bArr2[i];
                    return ((((long) bArr2[i + 7]) & 255) << 56) | (j & 255) | ((bArr2[i + 1] & 255) << 8) | ((bArr2[i + 2] & 255) << 16) | ((bArr2[i + 3] & 255) << 24) | ((bArr2[i + 4] & 255) << 32) | ((bArr2[i + 5] & 255) << 40) | ((bArr2[i + 6] & 255) << 48);
                }

                public final long r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
                    int i = this.MediaMetadataCompat;
                    int i2 = this.RemoteActionCompatParcelizer;
                    if (i2 != i) {
                        int i3 = i + 1;
                        byte[] bArr2 = this.write;
                        byte b = bArr2[i];
                        if (b >= 0) {
                            this.MediaMetadataCompat = i3;
                            return b;
                        }
                        if (i2 - i3 >= 9) {
                            int i4 = i + 2;
                            int i5 = (bArr2[i3] << 7) ^ b;
                            if (i5 < 0) {
                                j = i5 ^ (-128);
                            } else {
                                int i6 = i + 3;
                                int i7 = (bArr2[i4] << 14) ^ i5;
                                if (i7 >= 0) {
                                    j = i7 ^ 16256;
                                    i4 = i6;
                                } else {
                                    int i8 = i + 4;
                                    int i9 = i7 ^ (bArr2[i6] << 21);
                                    if (i9 < 0) {
                                        j4 = (-2080896) ^ i9;
                                    } else {
                                        long j5 = i9;
                                        i4 = i + 5;
                                        long j6 = j5 ^ (((long) bArr2[i8]) << 28);
                                        if (j6 >= 0) {
                                            j3 = 266354560;
                                        } else {
                                            i8 = i + 6;
                                            long j7 = j6 ^ (((long) bArr2[i4]) << 35);
                                            if (j7 < 0) {
                                                j2 = -34093383808L;
                                            } else {
                                                i4 = i + 7;
                                                j6 = j7 ^ (((long) bArr2[i8]) << 42);
                                                if (j6 >= 0) {
                                                    j3 = 4363953127296L;
                                                } else {
                                                    i8 = i + 8;
                                                    j7 = j6 ^ (((long) bArr2[i4]) << 49);
                                                    if (j7 < 0) {
                                                        j2 = -558586000294016L;
                                                    } else {
                                                        i4 = i + 9;
                                                        long j8 = (j7 ^ (((long) bArr2[i8]) << 56)) ^ 71499008037633920L;
                                                        if (j8 < 0) {
                                                            if (bArr2[i4] >= 0) {
                                                                i4 = i + 10;
                                                            }
                                                        }
                                                        j = j8;
                                                    }
                                                }
                                            }
                                            j4 = j2 ^ j7;
                                        }
                                        j = j3 ^ j6;
                                    }
                                    i4 = i8;
                                    j = j4;
                                }
                            }
                            this.MediaMetadataCompat = i4;
                            return j;
                        }
                    }
                    return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }

                public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() throws InvalidProtocolBufferException {
                    int i = this.MediaMetadataCompat;
                    if (this.RemoteActionCompatParcelizer - i < 4) {
                        MediaSessionCompatQueueItem(4);
                        i = this.MediaMetadataCompat;
                    }
                    this.MediaMetadataCompat = i + 4;
                    byte[] bArr2 = this.write;
                    return ((bArr2[i + 3] & 255) << 24) | (bArr2[i] & 255) | ((bArr2[i + 1] & 255) << 8) | ((bArr2[i + 2] & 255) << 16);
                }

                public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
                    int i;
                    int i2 = this.MediaMetadataCompat;
                    int i3 = this.RemoteActionCompatParcelizer;
                    if (i3 != i2) {
                        int i4 = i2 + 1;
                        byte[] bArr2 = this.write;
                        byte b = bArr2[i2];
                        if (b >= 0) {
                            this.MediaMetadataCompat = i4;
                            return b;
                        }
                        if (i3 - i4 >= 9) {
                            int i5 = i2 + 2;
                            int i6 = (bArr2[i4] << 7) ^ b;
                            if (i6 < 0) {
                                i = i6 ^ (-128);
                            } else {
                                int i7 = i2 + 3;
                                int i8 = (bArr2[i5] << 14) ^ i6;
                                if (i8 >= 0) {
                                    i = i8 ^ 16256;
                                } else {
                                    int i9 = i2 + 4;
                                    int i10 = i8 ^ (bArr2[i7] << 21);
                                    if (i10 < 0) {
                                        i = (-2080896) ^ i10;
                                    } else {
                                        i7 = i2 + 5;
                                        byte b2 = bArr2[i9];
                                        int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                        if (b2 < 0) {
                                            i9 = i2 + 6;
                                            if (bArr2[i7] < 0) {
                                                i7 = i2 + 7;
                                                if (bArr2[i9] < 0) {
                                                    i9 = i2 + 8;
                                                    if (bArr2[i7] < 0) {
                                                        i7 = i2 + 9;
                                                        if (bArr2[i9] < 0) {
                                                            if (bArr2[i7] >= 0) {
                                                                i5 = i2 + 10;
                                                                i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i = i11;
                                        }
                                        i = i11;
                                    }
                                    i5 = i9;
                                }
                                i5 = i7;
                            }
                            this.MediaMetadataCompat = i5;
                            return i;
                        }
                    }
                    return (int) r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }

                public final void r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
                    int i = this.RemoteActionCompatParcelizer + this.serializer;
                    this.RemoteActionCompatParcelizer = i;
                    int i2 = this.RatingCompat + i;
                    int i3 = this.MediaBrowserCompatMediaItem;
                    if (i2 <= i3) {
                        this.serializer = 0;
                        return;
                    }
                    int i4 = i2 - i3;
                    this.serializer = i4;
                    this.RemoteActionCompatParcelizer = i - i4;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean read() {
                    return this.MediaMetadataCompat == this.RemoteActionCompatParcelizer && !MediaBrowserCompatMediaItem(1);
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int write() {
                    return this.RatingCompat + this.MediaMetadataCompat;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final double IconCompatParcelizer() {
                    return Double.longBitsToDouble(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                }

                public final boolean MediaBrowserCompatMediaItem(int i) throws IOException {
                    int i2 = this.MediaMetadataCompat;
                    int i3 = this.RemoteActionCompatParcelizer;
                    if (i2 + i <= i3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                        return false;
                    }
                    int i4 = this.RatingCompat;
                    if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.MediaBrowserCompatMediaItem) {
                        byte[] bArr2 = this.write;
                        if (i2 > 0) {
                            if (i3 > i2) {
                                System.arraycopy(bArr2, i2, bArr2, 0, i3 - i2);
                            }
                            this.RatingCompat += i2;
                            this.RemoteActionCompatParcelizer -= i2;
                            this.MediaMetadataCompat = 0;
                        }
                        int i5 = this.RemoteActionCompatParcelizer;
                        int iMin = Math.min(bArr2.length - i5, (Integer.MAX_VALUE - this.RatingCompat) - i5);
                        InputStream inputStream2 = this.MediaDescriptionCompat;
                        int i6 = inputStream2.read(bArr2, i5, iMin);
                        if (i6 == 0 || i6 < -1 || i6 > bArr2.length) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(i6, inputStream2.getClass());
                            return false;
                        }
                        if (i6 > 0) {
                            this.RemoteActionCompatParcelizer += i6;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                            if (this.RemoteActionCompatParcelizer >= i) {
                                return true;
                            }
                            return MediaBrowserCompatMediaItem(i);
                        }
                    }
                    return false;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final float RatingCompat() {
                    return Float.intBitsToFloat(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
                }

                @Override // o.getEmbeddedViewFocusRect
                public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws InvalidProtocolBufferException {
                    int iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                    byte[] bArr2 = this.write;
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 > 0) {
                        int i = this.RemoteActionCompatParcelizer;
                        int i2 = this.MediaMetadataCompat;
                        if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 <= i - i2) {
                            String str = new String(bArr2, i2, iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, topLeft.serializer);
                            this.MediaMetadataCompat += iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            return str;
                        }
                    }
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == 0) {
                        return "";
                    }
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 > this.RemoteActionCompatParcelizer) {
                        return new String(serializer(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4), topLeft.serializer);
                    }
                    MediaSessionCompatQueueItem(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                    String str2 = new String(bArr2, this.MediaMetadataCompat, iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, topLeft.serializer);
                    this.MediaMetadataCompat += iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    return str2;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws IOException {
                    int iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                    int i = this.MediaMetadataCompat;
                    int i2 = this.RemoteActionCompatParcelizer;
                    byte[] bArrSerializer = this.write;
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 <= i2 - i && iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 > 0) {
                        this.MediaMetadataCompat = i + iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    } else {
                        if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == 0) {
                            return "";
                        }
                        i = 0;
                        if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 <= i2) {
                            MediaSessionCompatQueueItem(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                            this.MediaMetadataCompat = iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        } else {
                            bArrSerializer = serializer(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                        }
                    }
                    return getCenterRightF1C5BW0.read.write(bArrSerializer, i, iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                }

                @Override // o.getEmbeddedViewFocusRect
                public final moveFocusInChildren3ESFkO8 serializer() throws IOException {
                    int iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                    int i = this.RemoteActionCompatParcelizer;
                    int i2 = this.MediaMetadataCompat;
                    byte[] bArr2 = this.write;
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 <= i - i2 && iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 > 0) {
                        moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = moveFocusInChildren3ESFkO8.read(bArr2, i2, iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                        this.MediaMetadataCompat += iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        return movefocusinchildren3esfko8;
                    }
                    if (iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == 0) {
                        return moveFocusInChildren3ESFkO8.IconCompatParcelizer;
                    }
                    byte[] bArrMediaMetadataCompat = MediaMetadataCompat(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                    if (bArrMediaMetadataCompat != null) {
                        return moveFocusInChildren3ESFkO8.read(bArrMediaMetadataCompat, 0, bArrMediaMetadataCompat.length);
                    }
                    int i3 = this.MediaMetadataCompat;
                    int i4 = this.RemoteActionCompatParcelizer;
                    int length2 = i4 - i3;
                    this.RatingCompat += i4;
                    this.MediaMetadataCompat = 0;
                    this.RemoteActionCompatParcelizer = 0;
                    ArrayList<byte[]> arrayListMediaDescriptionCompat = MediaDescriptionCompat(iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 - length2);
                    byte[] bArr3 = new byte[iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4];
                    System.arraycopy(bArr2, i3, bArr3, 0, length2);
                    for (byte[] bArr4 : arrayListMediaDescriptionCompat) {
                        System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                        length2 += bArr4.length;
                    }
                    moveFocusInChildren3ESFkO8 movefocusinchildren3esfko9 = moveFocusInChildren3ESFkO8.IconCompatParcelizer;
                    return new moveFocusInChildren3ESFkO8(bArr3);
                }

                {
                    topLeft.RemoteActionCompatParcelizer(inputStream, "input");
                    this.MediaDescriptionCompat = inputStream;
                    this.write = new byte[Fields.TransformOrigin];
                    this.RemoteActionCompatParcelizer = 0;
                    this.MediaMetadataCompat = 0;
                    this.RatingCompat = 0;
                }

                @Override // o.getEmbeddedViewFocusRect
                public final int ResultReceiver() throws InvalidProtocolBufferException {
                    if (read()) {
                        this.MediaSessionCompatQueueItem = 0;
                        return 0;
                    }
                    int iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
                    this.MediaSessionCompatQueueItem = iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    if ((iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 >>> 3) != 0) {
                        return iR8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    }
                    throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
                }

                public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() throws InvalidProtocolBufferException {
                    long j = 0;
                    for (int i = 0; i < 64; i += 7) {
                        if (this.MediaMetadataCompat == this.RemoteActionCompatParcelizer) {
                            MediaSessionCompatQueueItem(1);
                        }
                        int i2 = this.MediaMetadataCompat;
                        this.MediaMetadataCompat = i2 + 1;
                        byte b = this.write[i2];
                        j |= ((long) (b & 127)) << i;
                        if ((b & 128) == 0) {
                            return j;
                        }
                    }
                    throw InvalidProtocolBufferException.serializer();
                }

                public final byte[] serializer(int i) throws IOException {
                    byte[] bArrMediaMetadataCompat = MediaMetadataCompat(i);
                    if (bArrMediaMetadataCompat != null) {
                        return bArrMediaMetadataCompat;
                    }
                    int i2 = this.MediaMetadataCompat;
                    int i3 = this.RemoteActionCompatParcelizer;
                    int length2 = i3 - i2;
                    this.RatingCompat += i3;
                    this.MediaMetadataCompat = 0;
                    this.RemoteActionCompatParcelizer = 0;
                    ArrayList<byte[]> arrayListMediaDescriptionCompat = MediaDescriptionCompat(i - length2);
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(this.write, i2, bArr2, 0, length2);
                    for (byte[] bArr3 : arrayListMediaDescriptionCompat) {
                        System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
                        length2 += bArr3.length;
                    }
                    return bArr2;
                }

                public final void MediaSessionCompatQueueItem(int i) throws InvalidProtocolBufferException {
                    if (MediaBrowserCompatMediaItem(i)) {
                        return;
                    }
                    if (i <= (Integer.MAX_VALUE - this.RatingCompat) - this.MediaMetadataCompat) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }

                @Override // o.getEmbeddedViewFocusRect
                public final void write(int i) throws InvalidProtocolBufferException {
                    if (this.MediaSessionCompatQueueItem != i) {
                        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // o.getEmbeddedViewFocusRect
                public final boolean read(int i) throws InvalidProtocolBufferException {
                    int iResultReceiver;
                    int i2 = i & 7;
                    int i3 = 0;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            RatingCompat(8);
                            return true;
                        }
                        if (i2 == 2) {
                            RatingCompat(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                            return true;
                        }
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return false;
                            }
                            if (i2 == 5) {
                                RatingCompat(4);
                                return true;
                            }
                            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                        }
                        do {
                            iResultReceiver = ResultReceiver();
                            if (iResultReceiver == 0) {
                                break;
                            }
                        } while (read(iResultReceiver));
                        write(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    int i4 = this.RemoteActionCompatParcelizer;
                    int i5 = this.MediaMetadataCompat;
                    byte[] bArr2 = this.write;
                    if (i4 - i5 >= 10) {
                        while (i3 < 10) {
                            int i6 = this.MediaMetadataCompat;
                            this.MediaMetadataCompat = i6 + 1;
                            if (bArr2[i6] < 0) {
                                i3++;
                            }
                        }
                        throw InvalidProtocolBufferException.serializer();
                    }
                    while (i3 < 10) {
                        if (this.MediaMetadataCompat == this.RemoteActionCompatParcelizer) {
                            MediaSessionCompatQueueItem(1);
                        }
                        int i7 = this.MediaMetadataCompat;
                        this.MediaMetadataCompat = i7 + 1;
                        if (bArr2[i7] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.serializer();
                    return true;
                }
            };
        }
        beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearchIconCompatParcelizer = beamBeats_I7lrPNgisInDirectionOfSearch.IconCompatParcelizer();
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) preferencesProto$PreferenceMap.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.NEW_MUTABLE_INSTANCE);
        try {
            CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
            cornerRadiusdefault.getClass();
            toStringAsFixed tostringasfixedRemoteActionCompatParcelizer = cornerRadiusdefault.RemoteActionCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance.getClass());
            CodedInputStreamReader codedInputStreamReader = getembeddedviewfocusrect.IconCompatParcelizer;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(getembeddedviewfocusrect);
            }
            tostringasfixedRemoteActionCompatParcelizer.write(isbettercandidate_i7lrpngminoraxisdistance, codedInputStreamReader, beambeats_i7lrpngisindirectionofsearchIconCompatParcelizer);
            tostringasfixedRemoteActionCompatParcelizer.IconCompatParcelizer(isbettercandidate_i7lrpngminoraxisdistance);
            if (isbettercandidate_i7lrpngminoraxisdistance.PlaybackStateCompatCustomAction()) {
                return (PreferencesProto$PreferenceMap) isbettercandidate_i7lrpngminoraxisdistance;
            }
            throw new UninitializedMessageException().IconCompatParcelizer();
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }
}
