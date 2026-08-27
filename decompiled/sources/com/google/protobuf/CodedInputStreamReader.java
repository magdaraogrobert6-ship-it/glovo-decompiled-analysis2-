package com.google.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.ClipEntry;
import o.ComposableSingletonsWrapper_androidKtlambda17594343501;
import o.CompositionLocalsKtLocalInputModeManager1;
import o.CompositionLocalsKtLocalWindowInfo1;
import o.DebugUtilsKt;
import o.DisposableSaveableStateRegistrylambda0;
import o.component26;
import o.consumeRestored;
import o.decodeFontSynthesisGVVA2EU;
import o.getClipMetadata;
import o.getDpSizeMYxV2XQ;
import o.getLocalDensity;
import o.getLocalProvidableScrollCaptureInProgress;
import o.onScroll;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStreamReader implements consumeRestored {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer = 0;
    public final CodedInputStream serializer;
    public int write;

    public final Object RemoteActionCompatParcelizer(Class cls, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        IconCompatParcelizer(2);
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26.IconCompatParcelizer.read(cls);
        Object obj = disposableSaveableStateRegistrylambda0.read();
        IconCompatParcelizer(obj, disposableSaveableStateRegistrylambda0, getlocalprovidablescrollcaptureinprogress);
        disposableSaveableStateRegistrylambda0.read(obj);
        return obj;
    }

    public final getClipMetadata write() throws InvalidProtocolBufferException.InvalidWireTypeException {
        IconCompatParcelizer(2);
        return this.serializer.MediaBrowserCompatMediaItem();
    }

    public final void IconCompatParcelizer(Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.serializer;
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        if (codedInputStream.write >= codedInputStream.RemoteActionCompatParcelizer) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = codedInputStream.read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        codedInputStream.write++;
        disposableSaveableStateRegistrylambda0.serializer(obj, this, getlocalprovidablescrollcaptureinprogress);
        codedInputStream.RemoteActionCompatParcelizer(0);
        codedInputStream.write--;
        codedInputStream.serializer(i);
    }

    public final void IconCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getLocalDensity;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.MediaMetadataCompat()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            int i3 = codedInputStream.read();
            do {
                list.add(Double.valueOf(codedInputStream.MediaMetadataCompat()));
            } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getLocalDensity getlocaldensity = (getLocalDensity) list;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                getlocaldensity.IconCompatParcelizer(codedInputStream.MediaMetadataCompat());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i4 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        int i5 = codedInputStream.read();
        do {
            getlocaldensity.IconCompatParcelizer(codedInputStream.MediaMetadataCompat());
        } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final boolean IconCompatParcelizer() {
        int i;
        CodedInputStream codedInputStream = this.serializer;
        if (codedInputStream.IconCompatParcelizer() || (i = this.IconCompatParcelizer) == this.write) {
            return false;
        }
        return codedInputStream.IconCompatParcelizer(i);
    }

    public final void MediaBrowserCompatMediaItem(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof CompositionLocalsKtLocalInputModeManager1;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                int i3 = codedInputStream.read();
                do {
                    list.add(Float.valueOf(codedInputStream.MediaSessionCompatResultReceiverWrapper()));
                } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Float.valueOf(codedInputStream.MediaSessionCompatResultReceiverWrapper()));
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            return;
        }
        CompositionLocalsKtLocalInputModeManager1 compositionLocalsKtLocalInputModeManager1 = (CompositionLocalsKtLocalInputModeManager1) list;
        int i4 = i & 7;
        if (i4 == 2) {
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            int i5 = codedInputStream.read();
            do {
                compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer(codedInputStream.MediaSessionCompatResultReceiverWrapper());
            } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            return;
        }
        if (i4 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            compositionLocalsKtLocalInputModeManager1.IconCompatParcelizer(codedInputStream.MediaSessionCompatResultReceiverWrapper());
            if (codedInputStream.IconCompatParcelizer()) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
    }

    public final void MediaDescriptionCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getDpSizeMYxV2XQ;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.MediaDescriptionCompat()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            int i3 = codedInputStream.read();
            do {
                list.add(Long.valueOf(codedInputStream.MediaDescriptionCompat()));
            } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.MediaDescriptionCompat());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i4 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        int i5 = codedInputStream.read();
        do {
            getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.MediaDescriptionCompat());
        } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void MediaMetadataCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getDpSizeMYxV2XQ;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.PlaybackStateCompatCustomAction()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Long.valueOf(codedInputStream.PlaybackStateCompatCustomAction()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.PlaybackStateCompatCustomAction());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.PlaybackStateCompatCustomAction());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void MediaSessionCompatQueueItem(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.ParcelableVolumeInfo()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Integer.valueOf(codedInputStream.ParcelableVolumeInfo()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.ParcelableVolumeInfo());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.ParcelableVolumeInfo());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void MediaSessionCompatResultReceiverWrapper(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getDpSizeMYxV2XQ;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Long.valueOf(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void MediaSessionCompatToken(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getDpSizeMYxV2XQ;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Long.valueOf(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void ParcelableVolumeInfo(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof getDpSizeMYxV2XQ;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            int i3 = codedInputStream.read();
            do {
                list.add(Long.valueOf(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
            } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        getDpSizeMYxV2XQ getdpsizemyxv2xq = (getDpSizeMYxV2XQ) list;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i4 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        serializer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        int i5 = codedInputStream.read();
        do {
            getdpsizemyxv2xq.IconCompatParcelizer(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
        } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void PlaybackStateCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Integer.valueOf(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void PlaybackStateCompatCustomAction(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Integer.valueOf(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void RatingCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                int i3 = codedInputStream.read();
                do {
                    list.add(Integer.valueOf(codedInputStream.PlaybackStateCompat()));
                } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.PlaybackStateCompat()));
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i4 = i & 7;
        if (i4 == 2) {
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            int i5 = codedInputStream.read();
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.PlaybackStateCompat());
            } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            return;
        }
        if (i4 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.PlaybackStateCompat());
            if (codedInputStream.IconCompatParcelizer()) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
    }

    public final void RemoteActionCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof ClipEntry;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.serializer()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Boolean.valueOf(codedInputStream.serializer()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        ClipEntry clipEntry = (ClipEntry) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                clipEntry.serializer(codedInputStream.serializer());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            clipEntry.serializer(codedInputStream.serializer());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public final void read(Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) {
        int i = this.write;
        this.write = ((this.IconCompatParcelizer >>> 3) << 3) | 4;
        try {
            disposableSaveableStateRegistrylambda0.serializer(obj, this, getlocalprovidablescrollcaptureinprogress);
            if (this.IconCompatParcelizer != this.write) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.write = i;
        } catch (Throwable th) {
            this.write = i;
            throw th;
        }
    }

    public final void read(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                int i3 = codedInputStream.read();
                do {
                    list.add(Integer.valueOf(codedInputStream.RatingCompat()));
                } while (codedInputStream.read() < i3 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.RatingCompat()));
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i4 = i & 7;
        if (i4 == 2) {
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            read(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            int i5 = codedInputStream.read();
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.RatingCompat());
            } while (codedInputStream.read() < i5 + iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
            return;
        }
        if (i4 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.RatingCompat());
            if (codedInputStream.IconCompatParcelizer()) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
    }

    public final Object write(onScroll onscroll, Class cls, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i = ComposableSingletonsWrapper_androidKtlambda17594343501.write[onscroll.ordinal()];
        CodedInputStream codedInputStream = this.serializer;
        switch (i) {
            case 1:
                IconCompatParcelizer(0);
                return Boolean.valueOf(codedInputStream.serializer());
            case 2:
                return write();
            case 3:
                IconCompatParcelizer(1);
                return Double.valueOf(codedInputStream.MediaMetadataCompat());
            case 4:
                IconCompatParcelizer(0);
                return Integer.valueOf(codedInputStream.MediaSessionCompatQueueItem());
            case 5:
                IconCompatParcelizer(5);
                return Integer.valueOf(codedInputStream.RatingCompat());
            case 6:
                IconCompatParcelizer(1);
                return Long.valueOf(codedInputStream.MediaDescriptionCompat());
            case 7:
                IconCompatParcelizer(5);
                return Float.valueOf(codedInputStream.MediaSessionCompatResultReceiverWrapper());
            case 8:
                IconCompatParcelizer(0);
                return Integer.valueOf(codedInputStream.ParcelableVolumeInfo());
            case 9:
                IconCompatParcelizer(0);
                return Long.valueOf(codedInputStream.PlaybackStateCompatCustomAction());
            case 10:
                return RemoteActionCompatParcelizer(cls, getlocalprovidablescrollcaptureinprogress);
            case 11:
                IconCompatParcelizer(5);
                return Integer.valueOf(codedInputStream.PlaybackStateCompat());
            case 12:
                IconCompatParcelizer(1);
                return Long.valueOf(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            case 13:
                IconCompatParcelizer(0);
                return Integer.valueOf(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 14:
                IconCompatParcelizer(0);
                return Long.valueOf(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
            case 15:
                IconCompatParcelizer(2);
                return codedInputStream.ResultReceiver();
            case 16:
                IconCompatParcelizer(0);
                return Integer.valueOf(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            case 17:
                IconCompatParcelizer(0);
                return Long.valueOf(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unsupported field type.");
                return null;
        }
    }

    public final void write(int i) throws InvalidProtocolBufferException {
        if (this.serializer.read() != i) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
    }

    public final void write(List list) throws InvalidProtocolBufferException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        boolean z = list instanceof DebugUtilsKt;
        int i = this.IconCompatParcelizer;
        CodedInputStream codedInputStream = this.serializer;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.MediaSessionCompatQueueItem()));
                    if (codedInputStream.IconCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            do {
                list.add(Integer.valueOf(codedInputStream.MediaSessionCompatQueueItem()));
            } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            return;
        }
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                debugUtilsKt.IconCompatParcelizer(codedInputStream.MediaSessionCompatQueueItem());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9 = codedInputStream.read() + codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        do {
            debugUtilsKt.IconCompatParcelizer(codedInputStream.MediaSessionCompatQueueItem());
        } while (codedInputStream.read() < iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
        write(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC9);
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        CompositionLocalsKtLocalWindowInfo1.read(codedInputStream, "input");
        this.serializer = codedInputStream;
        codedInputStream.read = this;
    }

    public final int serializer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = 0;
        } else {
            this.IconCompatParcelizer = this.serializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0 || i2 == this.write) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public static void read(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }

    public static void serializer(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }

    public final void IconCompatParcelizer(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.IconCompatParcelizer & 7) != i) {
            throw InvalidProtocolBufferException.serializer();
        }
    }

    public final void read(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strComponentActivity;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
        if ((this.IconCompatParcelizer & 7) != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        boolean z2 = list instanceof decodeFontSynthesisGVVA2EU;
        CodedInputStream codedInputStream = this.serializer;
        if (z2 && !z) {
            decodeFontSynthesisGVVA2EU decodefontsynthesisgvva2eu = (decodeFontSynthesisGVVA2EU) list;
            do {
                decodefontsynthesisgvva2eu.read(write());
                if (codedInputStream.IconCompatParcelizer()) {
                    return;
                } else {
                    iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                }
            } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2 == this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg2;
            return;
        }
        do {
            if (z) {
                IconCompatParcelizer(2);
                strComponentActivity = codedInputStream.ResultReceiver();
            } else {
                IconCompatParcelizer(2);
                strComponentActivity = codedInputStream.ComponentActivity();
            }
            list.add(strComponentActivity);
            if (codedInputStream.IconCompatParcelizer()) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public final void serializer(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if ((this.IconCompatParcelizer & 7) != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            list.add(write());
            CodedInputStream codedInputStream = this.serializer;
            if (codedInputStream.IconCompatParcelizer()) {
                return;
            } else {
                iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            }
        } while (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }
}
