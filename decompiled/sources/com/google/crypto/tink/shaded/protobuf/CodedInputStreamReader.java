package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import o.LayoutNodeCompanionConstructor1;
import o.LayoutNodeNoIntrinsicsMeasurePolicy;
import o.accessgetDrawNodep;
import o.getCoordinatesAccessedDuringPlacement;
import o.getLongPressTimeoutMillis;
import o.getMinimumTouchTargetSizeMYxV2XQ;
import o.getNotPlacedPlaceOrderuiannotations;
import o.setOnAttachui;
import o.setOuterToInnerOffsetDirtyui;
import o.setOuterToInnerOffsetgyyYBsui;
import o.setRectInParentDirtyui;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStreamReader {
    public int IconCompatParcelizer = 0;
    public final setOuterToInnerOffsetDirtyui read;
    public int serializer;
    public int write;

    public final setOnAttachui IconCompatParcelizer() throws InvalidProtocolBufferException.InvalidWireTypeException {
        IconCompatParcelizer(2);
        return this.read.serializer();
    }

    public final void IconCompatParcelizer(Object obj, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws InvalidProtocolBufferException {
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (setoutertoinneroffsetdirtyui.read >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iWrite = setoutertoinneroffsetdirtyui.write(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        setoutertoinneroffsetdirtyui.read++;
        getcoordinatesaccessedduringplacement.write(obj, this, getnotplacedplaceorderuiannotations);
        setoutertoinneroffsetdirtyui.serializer(0);
        setoutertoinneroffsetdirtyui.read--;
        setoutertoinneroffsetdirtyui.IconCompatParcelizer(iWrite);
    }

    public final void MediaBrowserCompatMediaItem(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof accessgetDrawNodep;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatQueueItem()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            int iWrite = setoutertoinneroffsetdirtyui.write();
            do {
                list.add(Long.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatQueueItem()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            return;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatQueueItem());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
        int iWrite2 = setoutertoinneroffsetdirtyui.write();
        do {
            accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatQueueItem());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
    }

    public final void MediaDescriptionCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof accessgetDrawNodep;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(setoutertoinneroffsetdirtyui.ParcelableVolumeInfo()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Long.valueOf(setoutertoinneroffsetdirtyui.ParcelableVolumeInfo()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.ParcelableVolumeInfo());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.ParcelableVolumeInfo());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void MediaMetadataCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaDescriptionCompat()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaDescriptionCompat()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaDescriptionCompat());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaDescriptionCompat());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void MediaSessionCompatQueueItem(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof LayoutNodeCompanionConstructor1;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                int iWrite = setoutertoinneroffsetdirtyui.write();
                do {
                    list.add(Float.valueOf(setoutertoinneroffsetdirtyui.MediaMetadataCompat()));
                } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Float.valueOf(setoutertoinneroffsetdirtyui.MediaMetadataCompat()));
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            return;
        }
        LayoutNodeCompanionConstructor1 layoutNodeCompanionConstructor1 = (LayoutNodeCompanionConstructor1) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            int iWrite2 = setoutertoinneroffsetdirtyui.write();
            do {
                layoutNodeCompanionConstructor1.write(setoutertoinneroffsetdirtyui.MediaMetadataCompat());
            } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            layoutNodeCompanionConstructor1.write(setoutertoinneroffsetdirtyui.MediaMetadataCompat());
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
        this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
    }

    public final void MediaSessionCompatResultReceiverWrapper(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof accessgetDrawNodep;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(setoutertoinneroffsetdirtyui.ResultReceiver()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Long.valueOf(setoutertoinneroffsetdirtyui.ResultReceiver()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.ResultReceiver());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.ResultReceiver());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void MediaSessionCompatToken(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof accessgetDrawNodep;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(setoutertoinneroffsetdirtyui.PlaybackStateCompat()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            int iWrite = setoutertoinneroffsetdirtyui.write();
            do {
                list.add(Long.valueOf(setoutertoinneroffsetdirtyui.PlaybackStateCompat()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            return;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.PlaybackStateCompat());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
        int iWrite2 = setoutertoinneroffsetdirtyui.write();
        do {
            accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.PlaybackStateCompat());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
    }

    public final void ParcelableVolumeInfo(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof accessgetDrawNodep;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatResultReceiverWrapper()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Long.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatResultReceiverWrapper()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        accessgetDrawNodep accessgetdrawnodep = (accessgetDrawNodep) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatResultReceiverWrapper());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            accessgetdrawnodep.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatResultReceiverWrapper());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void PlaybackStateCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void PlaybackStateCompatCustomAction(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatToken()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaSessionCompatToken()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatToken());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaSessionCompatToken());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void RatingCompat(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                int iWrite = setoutertoinneroffsetdirtyui.write();
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.PlaybackStateCompatCustomAction()));
                } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.PlaybackStateCompatCustomAction()));
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            int iWrite2 = setoutertoinneroffsetdirtyui.write();
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.PlaybackStateCompatCustomAction());
            } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.PlaybackStateCompatCustomAction());
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
        this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
    }

    public final void RemoteActionCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                int iWrite = setoutertoinneroffsetdirtyui.write();
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.RatingCompat()));
                } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.serializer();
            }
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.RatingCompat()));
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            read(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            int iWrite2 = setoutertoinneroffsetdirtyui.write();
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.RatingCompat());
            } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.RatingCompat());
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
        this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
    }

    public final void read(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof getLongPressTimeoutMillis;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaBrowserCompatMediaItem()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Integer.valueOf(setoutertoinneroffsetdirtyui.MediaBrowserCompatMediaItem()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaBrowserCompatMediaItem());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            getlongpresstimeoutmillis.serializer(setoutertoinneroffsetdirtyui.MediaBrowserCompatMediaItem());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void serializer(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof setOuterToInnerOffsetgyyYBsui;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(setoutertoinneroffsetdirtyui.read()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iWrite = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            do {
                list.add(Boolean.valueOf(setoutertoinneroffsetdirtyui.read()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite);
            write(iWrite);
            return;
        }
        setOuterToInnerOffsetgyyYBsui setoutertoinneroffsetgyyybsui = (setOuterToInnerOffsetgyyYBsui) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                setoutertoinneroffsetgyyybsui.serializer(setoutertoinneroffsetdirtyui.read());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iWrite2 = setoutertoinneroffsetdirtyui.write() + setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        do {
            setoutertoinneroffsetgyyybsui.serializer(setoutertoinneroffsetdirtyui.read());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2);
        write(iWrite2);
    }

    public final void write(int i) throws InvalidProtocolBufferException {
        if (this.read.write() != i) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }

    public final void write(Object obj, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        int i = this.write;
        this.write = ((this.serializer >>> 3) << 3) | 4;
        try {
            getcoordinatesaccessedduringplacement.write(obj, this, getnotplacedplaceorderuiannotations);
            if (this.serializer != this.write) {
                throw InvalidProtocolBufferException.RatingCompat();
            }
            this.write = i;
        } catch (Throwable th) {
            this.write = i;
            throw th;
        }
    }

    public final void write(List list) throws InvalidProtocolBufferException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        boolean z = list instanceof setRectInParentDirtyui;
        int i = this.serializer;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(setoutertoinneroffsetdirtyui.IconCompatParcelizer()));
                    if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                        return;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    }
                } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
                this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            int iWrite = setoutertoinneroffsetdirtyui.write();
            do {
                list.add(Double.valueOf(setoutertoinneroffsetdirtyui.IconCompatParcelizer()));
            } while (setoutertoinneroffsetdirtyui.write() < iWrite + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            return;
        }
        setRectInParentDirtyui setrectinparentdirtyui = (setRectInParentDirtyui) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                setrectinparentdirtyui.serializer(setoutertoinneroffsetdirtyui.IconCompatParcelizer());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        int iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = setoutertoinneroffsetdirtyui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        serializer(iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
        int iWrite2 = setoutertoinneroffsetdirtyui.write();
        do {
            setrectinparentdirtyui.serializer(setoutertoinneroffsetdirtyui.IconCompatParcelizer());
        } while (setoutertoinneroffsetdirtyui.write() < iWrite2 + iR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
    }

    public CodedInputStreamReader(setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui) {
        getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(setoutertoinneroffsetdirtyui, "input");
        this.read = setoutertoinneroffsetdirtyui;
        setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer = this;
    }

    public final int read() {
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            this.serializer = i;
            this.IconCompatParcelizer = 0;
        } else {
            this.serializer = this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        }
        int i2 = this.serializer;
        if (i2 == 0 || i2 == this.write) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public static void read(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
    }

    public static void serializer(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
    }

    public final void IconCompatParcelizer(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.serializer & 7) != i) {
            throw InvalidProtocolBufferException.serializer();
        }
    }

    public final void IconCompatParcelizer(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if ((this.serializer & 7) != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        do {
            list.add(IconCompatParcelizer());
            setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
        this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final void write(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        if ((this.serializer & 7) != 2) {
            throw InvalidProtocolBufferException.serializer();
        }
        boolean z2 = list instanceof LayoutNodeNoIntrinsicsMeasurePolicy;
        setOuterToInnerOffsetDirtyui setoutertoinneroffsetdirtyui = this.read;
        if (z2 && !z) {
            LayoutNodeNoIntrinsicsMeasurePolicy layoutNodeNoIntrinsicsMeasurePolicy = (LayoutNodeNoIntrinsicsMeasurePolicy) list;
            do {
                layoutNodeNoIntrinsicsMeasurePolicy.write(IconCompatParcelizer());
                if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                    return;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
            } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 == this.serializer);
            this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            return;
        }
        do {
            if (z) {
                IconCompatParcelizer(2);
                strR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = setoutertoinneroffsetdirtyui.ComponentActivity();
            } else {
                IconCompatParcelizer(2);
                strR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = setoutertoinneroffsetdirtyui.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            }
            list.add(strR8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            if (setoutertoinneroffsetdirtyui.RemoteActionCompatParcelizer()) {
                return;
            } else {
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setoutertoinneroffsetdirtyui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            }
        } while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == this.serializer);
        this.IconCompatParcelizer = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }
}
