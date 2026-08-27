package com.sentiance.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.BrazeViewBounds;
import o.DelayedInitializationAnalyticsBehavior;
import o.SessionStateChangedEventChangeType;
import o.accesssetDiskLruCachep;
import o.downloadBitmapFromUrldefault;
import o.fromStringlambda1;
import o.getRequestInitiationTime;
import o.getUnviewedCardCount;
import o.isFromOfflineStorage;
import o.r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
import o.r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4;

/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public int IconCompatParcelizer = 0;
    public final u read;
    public int serializer;
    public int write;

    public final Object write(Class cls, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        write(2);
        fromStringlambda1 fromstringlambda1 = BrazeViewBounds.read.read(cls);
        GeneratedMessageLite generatedMessageLiteSerializer = fromstringlambda1.serializer();
        read(generatedMessageLiteSerializer, fromstringlambda1, delayedInitializationAnalyticsBehavior);
        fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteSerializer);
        return generatedMessageLiteSerializer;
    }

    public final void MediaBrowserCompatMediaItem(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void MediaMetadataCompat(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(uVar.serializer()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Integer.valueOf(uVar.serializer()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.serializer());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.serializer());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void MediaSessionCompatQueueItem(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(uVar.IconCompatParcelizer()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Long.valueOf(uVar.IconCompatParcelizer()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.IconCompatParcelizer());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.IconCompatParcelizer());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void MediaSessionCompatResultReceiverWrapper(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 1) {
                do {
                    list.add(Long.valueOf(uVar.ResultReceiver()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iSerializer = uVar.serializer();
            RemoteActionCompatParcelizer(iSerializer);
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
            do {
                list.add(Long.valueOf(uVar.ResultReceiver()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
            return;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i5 = i3 & 7;
        if (i5 == 1) {
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.ResultReceiver());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iSerializer2 = uVar.serializer();
        RemoteActionCompatParcelizer(iSerializer2);
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
        do {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.ResultReceiver());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
    }

    public final void MediaSessionCompatToken(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 1) {
                do {
                    list.add(Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iSerializer = uVar.serializer();
            RemoteActionCompatParcelizer(iSerializer);
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
            do {
                list.add(Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
            return;
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i5 = i3 & 7;
        if (i5 == 1) {
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iSerializer2 = uVar.serializer();
        RemoteActionCompatParcelizer(iSerializer2);
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
        do {
            r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
    }

    public final void ParcelableVolumeInfo(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(uVar.ComponentActivity()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Integer.valueOf(uVar.ComponentActivity()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.ComponentActivity());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.ComponentActivity());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void PlaybackStateCompat(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(uVar.PlaybackStateCompatCustomAction()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Integer.valueOf(uVar.PlaybackStateCompatCustomAction()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.PlaybackStateCompatCustomAction());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.PlaybackStateCompatCustomAction());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void PlaybackStateCompatCustomAction(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                r8lambdad9d8zanadasmqv1rdea0gwxvs4.read(uVar.MediaSessionCompatResultReceiverWrapper());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            r8lambdad9d8zanadasmqv1rdea0gwxvs4.read(uVar.MediaSessionCompatResultReceiverWrapper());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void RatingCompat(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof accesssetDiskLruCachep;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 1) {
                do {
                    list.add(Double.valueOf(uVar.PlaybackStateCompat()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iSerializer = uVar.serializer();
            RemoteActionCompatParcelizer(iSerializer);
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
            do {
                list.add(Double.valueOf(uVar.PlaybackStateCompat()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
            return;
        }
        accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) list;
        int i5 = i3 & 7;
        if (i5 == 1) {
            do {
                accesssetdisklrucachep.RemoteActionCompatParcelizer(uVar.PlaybackStateCompat());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iSerializer2 = uVar.serializer();
        RemoteActionCompatParcelizer(iSerializer2);
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
        do {
            accesssetdisklrucachep.RemoteActionCompatParcelizer(uVar.PlaybackStateCompat());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
    }

    public final Object RemoteActionCompatParcelizer(WireFormat$FieldType wireFormat$FieldType, Class cls, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i = downloadBitmapFromUrldefault.IconCompatParcelizer[wireFormat$FieldType.ordinal()];
        u uVar = this.read;
        switch (i) {
            case 1:
                write(0);
                return Boolean.valueOf(uVar.MediaSessionCompatResultReceiverWrapper());
            case 2:
                return serializer();
            case 3:
                write(1);
                return Double.valueOf(uVar.PlaybackStateCompat());
            case 4:
                write(0);
                return Integer.valueOf(uVar.PlaybackStateCompatCustomAction());
            case 5:
                write(5);
                return Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 6:
                write(1);
                return Long.valueOf(uVar.ResultReceiver());
            case 7:
                write(5);
                return Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            case 8:
                write(0);
                return Integer.valueOf(uVar.ComponentActivity());
            case 9:
                write(0);
                return Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
            case 10:
                return write(cls, delayedInitializationAnalyticsBehavior);
            case 11:
                write(5);
                return Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            case 12:
                write(1);
                return Long.valueOf(uVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
            case 13:
                write(0);
                return Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
            case 14:
                write(0);
                return Long.valueOf(uVar.IconCompatParcelizer());
            case 15:
                write(2);
                return uVar.write();
            case 16:
                write(0);
                return Integer.valueOf(uVar.serializer());
            case 17:
                write(0);
                return Long.valueOf(uVar.MediaDescriptionCompat());
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unsupported field type.");
                return null;
        }
    }

    public final void RemoteActionCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                list.add(Integer.valueOf(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()));
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem);
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
        } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
        IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
    }

    public final void read(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 2) {
                int iSerializer = uVar.serializer();
                read(iSerializer);
                int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
                do {
                    list.add(Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
                } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
                return;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            do {
                list.add(Integer.valueOf(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()));
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i = uVar.read();
                }
            } while (i == this.serializer);
            this.IconCompatParcelizer = i;
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 2) {
            int iSerializer2 = uVar.serializer();
            read(iSerializer2);
            int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
            return;
        }
        if (i5 != 5) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            if (uVar.ParcelableVolumeInfo()) {
                return;
            } else {
                i2 = uVar.read();
            }
        } while (i2 == this.serializer);
        this.IconCompatParcelizer = i2;
    }

    public final void serializer(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getRequestInitiationTime;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 2) {
                int iSerializer = uVar.serializer();
                read(iSerializer);
                int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
                do {
                    list.add(Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
                } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
                return;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            do {
                list.add(Float.valueOf(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()));
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i = uVar.read();
                }
            } while (i == this.serializer);
            this.IconCompatParcelizer = i;
            return;
        }
        getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) list;
        int i5 = i3 & 7;
        if (i5 == 2) {
            int iSerializer2 = uVar.serializer();
            read(iSerializer2);
            int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
            do {
                getrequestinitiationtime.write(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
            return;
        }
        if (i5 != 5) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        do {
            getrequestinitiationtime.write(uVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            if (uVar.ParcelableVolumeInfo()) {
                return;
            } else {
                i2 = uVar.read();
            }
        } while (i2 == this.serializer);
        this.IconCompatParcelizer = i2;
    }

    public final void write(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof getUnviewedCardCount;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 2) {
                int iSerializer = uVar.serializer();
                read(iSerializer);
                int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem();
                do {
                    list.add(Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem + iSerializer);
                return;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            do {
                list.add(Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i = uVar.read();
                }
            } while (i == this.serializer);
            this.IconCompatParcelizer = i;
            return;
        }
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) list;
        int i5 = i3 & 7;
        if (i5 == 2) {
            int iSerializer2 = uVar.serializer();
            read(iSerializer2);
            int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem();
            do {
                getunviewedcardcount.IconCompatParcelizer(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2 + iSerializer2);
            return;
        }
        if (i5 != 5) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        do {
            getunviewedcardcount.IconCompatParcelizer(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            if (uVar.ParcelableVolumeInfo()) {
                return;
            } else {
                i2 = uVar.read();
            }
        } while (i2 == this.serializer);
        this.IconCompatParcelizer = i2;
    }

    public v(u uVar) {
        isFromOfflineStorage.read(uVar, "input");
        this.read = uVar;
        uVar.RemoteActionCompatParcelizer = this;
    }

    public final int read() {
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            this.serializer = i;
            this.IconCompatParcelizer = 0;
        } else {
            this.serializer = this.read.read();
        }
        int i2 = this.serializer;
        if (i2 == 0 || i2 == this.write) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void MediaDescriptionCompat(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i;
        if ((this.serializer & 7) != 2) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        do {
            list.add(serializer());
            u uVar = this.read;
            if (uVar.ParcelableVolumeInfo()) {
                return;
            } else {
                i = uVar.read();
            }
        } while (i == this.serializer);
        this.IconCompatParcelizer = i;
    }

    public final void write(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.serializer & 7) != i) {
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
    }

    public final ByteString serializer() throws InvalidProtocolBufferException.InvalidWireTypeException {
        write(2);
        return this.read.MediaSessionCompatToken();
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i;
        u uVar = this.read;
        if (uVar.ParcelableVolumeInfo() || (i = this.serializer) == this.write) {
            return false;
        }
        return uVar.read(i);
    }

    public final void serializer(Object obj, fromStringlambda1 fromstringlambda1, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        int i = this.write;
        this.write = ((this.serializer >>> 3) << 3) | 4;
        try {
            fromstringlambda1.write(obj, this, delayedInitializationAnalyticsBehavior);
            if (this.serializer == this.write) {
                this.write = i;
                return;
            }
            throw InvalidProtocolBufferException.RatingCompat();
        } catch (Throwable th) {
            this.write = i;
            throw th;
        }
    }

    public final void read(Object obj, fromStringlambda1 fromstringlambda1, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        u uVar = this.read;
        int iSerializer = uVar.serializer();
        if (uVar.read < 100) {
            int iIconCompatParcelizer = uVar.IconCompatParcelizer(iSerializer);
            uVar.read++;
            fromstringlambda1.write(obj, this, delayedInitializationAnalyticsBehavior);
            uVar.RemoteActionCompatParcelizer(0);
            uVar.read--;
            uVar.write(iIconCompatParcelizer);
            return;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static void read(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
    }

    public static void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
    }

    public final void read(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strRemoteActionCompatParcelizer;
        int i;
        int i2;
        if ((this.serializer & 7) == 2) {
            boolean z2 = list instanceof SessionStateChangedEventChangeType;
            u uVar = this.read;
            if (z2 && !z) {
                SessionStateChangedEventChangeType sessionStateChangedEventChangeType = (SessionStateChangedEventChangeType) list;
                do {
                    sessionStateChangedEventChangeType.IconCompatParcelizer(serializer());
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i2 = uVar.read();
                    }
                } while (i2 == this.serializer);
                this.IconCompatParcelizer = i2;
                return;
            }
            do {
                if (z) {
                    write(2);
                    strRemoteActionCompatParcelizer = uVar.write();
                } else {
                    write(2);
                    strRemoteActionCompatParcelizer = uVar.RemoteActionCompatParcelizer();
                }
                list.add(strRemoteActionCompatParcelizer);
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i = uVar.read();
                }
            } while (i == this.serializer);
            this.IconCompatParcelizer = i;
            return;
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(List list) throws InvalidProtocolBufferException {
        int i;
        int i2;
        boolean z = list instanceof r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
        int i3 = this.serializer;
        u uVar = this.read;
        if (!z) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(uVar.MediaDescriptionCompat()));
                    if (uVar.ParcelableVolumeInfo()) {
                        return;
                    } else {
                        i = uVar.read();
                    }
                } while (i == this.serializer);
                this.IconCompatParcelizer = i;
                return;
            }
            if (i4 == 2) {
                int iMediaBrowserCompatMediaItem = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
                do {
                    list.add(Long.valueOf(uVar.MediaDescriptionCompat()));
                } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem);
                IconCompatParcelizer(iMediaBrowserCompatMediaItem);
                return;
            }
            throw InvalidProtocolBufferException.IconCompatParcelizer();
        }
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) list;
        int i5 = i3 & 7;
        if (i5 == 0) {
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.MediaDescriptionCompat());
                if (uVar.ParcelableVolumeInfo()) {
                    return;
                } else {
                    i2 = uVar.read();
                }
            } while (i2 == this.serializer);
            this.IconCompatParcelizer = i2;
            return;
        }
        if (i5 == 2) {
            int iMediaBrowserCompatMediaItem2 = uVar.MediaBrowserCompatMediaItem() + uVar.serializer();
            do {
                r8lambdawenh2zfjpauxgrrcztm8m6cjb0.RemoteActionCompatParcelizer(uVar.MediaDescriptionCompat());
            } while (uVar.MediaBrowserCompatMediaItem() < iMediaBrowserCompatMediaItem2);
            IconCompatParcelizer(iMediaBrowserCompatMediaItem2);
            return;
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
        if (this.read.MediaBrowserCompatMediaItem() != i) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }
}
