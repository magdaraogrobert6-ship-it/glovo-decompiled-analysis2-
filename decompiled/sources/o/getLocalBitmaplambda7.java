package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda7 extends AbstractMap implements Serializable {
    public static final setIsHtmlInAppMessageHtmlLinkTargetEnabled write = new setIsHtmlInAppMessageHtmlLinkTargetEnabled(3);
    public getLocalBitmaplambda5 read;
    public getLocalBitmaplambda5 serializer;
    public int MediaBrowserCompatMediaItem = 0;
    public int MediaDescriptionCompat = 0;
    public final Comparator IconCompatParcelizer = write;
    public final getLocalBitmaplambda8 RemoteActionCompatParcelizer = new getLocalBitmaplambda8();
    public getLocalBitmaplambda8[] MediaMetadataCompat = new getLocalBitmaplambda8[16];
    public int RatingCompat = 12;

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void serializer(getLocalBitmaplambda8 getlocalbitmaplambda8) {
        getLocalBitmaplambda8 getlocalbitmaplambda9 = getlocalbitmaplambda8.read;
        getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda8.MediaBrowserCompatMediaItem;
        getLocalBitmaplambda8 getlocalbitmaplambda11 = getlocalbitmaplambda9.read;
        getLocalBitmaplambda8 getlocalbitmaplambda12 = getlocalbitmaplambda9.MediaBrowserCompatMediaItem;
        getlocalbitmaplambda8.read = getlocalbitmaplambda12;
        if (getlocalbitmaplambda12 != null) {
            getlocalbitmaplambda12.MediaMetadataCompat = getlocalbitmaplambda8;
        }
        IconCompatParcelizer(getlocalbitmaplambda8, getlocalbitmaplambda9);
        getlocalbitmaplambda9.MediaBrowserCompatMediaItem = getlocalbitmaplambda8;
        getlocalbitmaplambda8.MediaMetadataCompat = getlocalbitmaplambda9;
        int iMax = Math.max(getlocalbitmaplambda10 != null ? getlocalbitmaplambda10.write : 0, getlocalbitmaplambda12 != null ? getlocalbitmaplambda12.write : 0) + 1;
        getlocalbitmaplambda8.write = iMax;
        getlocalbitmaplambda9.write = Math.max(iMax, getlocalbitmaplambda11 != null ? getlocalbitmaplambda11.write : 0) + 1;
    }

    public final void serializer(getLocalBitmaplambda8 getlocalbitmaplambda8, boolean z) {
        while (getlocalbitmaplambda8 != null) {
            getLocalBitmaplambda8 getlocalbitmaplambda9 = getlocalbitmaplambda8.read;
            getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda8.MediaBrowserCompatMediaItem;
            int i = getlocalbitmaplambda9 != null ? getlocalbitmaplambda9.write : 0;
            int i2 = getlocalbitmaplambda10 != null ? getlocalbitmaplambda10.write : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                getLocalBitmaplambda8 getlocalbitmaplambda11 = getlocalbitmaplambda10.read;
                getLocalBitmaplambda8 getlocalbitmaplambda12 = getlocalbitmaplambda10.MediaBrowserCompatMediaItem;
                int i4 = (getlocalbitmaplambda11 != null ? getlocalbitmaplambda11.write : 0) - (getlocalbitmaplambda12 != null ? getlocalbitmaplambda12.write : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    serializer(getlocalbitmaplambda10);
                }
                write(getlocalbitmaplambda8);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                getLocalBitmaplambda8 getlocalbitmaplambda13 = getlocalbitmaplambda9.read;
                getLocalBitmaplambda8 getlocalbitmaplambda14 = getlocalbitmaplambda9.MediaBrowserCompatMediaItem;
                int i5 = (getlocalbitmaplambda13 != null ? getlocalbitmaplambda13.write : 0) - (getlocalbitmaplambda14 != null ? getlocalbitmaplambda14.write : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    write(getlocalbitmaplambda9);
                }
                serializer(getlocalbitmaplambda8);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                getlocalbitmaplambda8.write = i + 1;
                if (z) {
                    return;
                }
            } else {
                getlocalbitmaplambda8.write = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            getlocalbitmaplambda8 = getlocalbitmaplambda8.MediaMetadataCompat;
        }
    }

    public final void write(getLocalBitmaplambda8 getlocalbitmaplambda8) {
        getLocalBitmaplambda8 getlocalbitmaplambda9 = getlocalbitmaplambda8.read;
        getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda8.MediaBrowserCompatMediaItem;
        getLocalBitmaplambda8 getlocalbitmaplambda11 = getlocalbitmaplambda10.read;
        getLocalBitmaplambda8 getlocalbitmaplambda12 = getlocalbitmaplambda10.MediaBrowserCompatMediaItem;
        getlocalbitmaplambda8.MediaBrowserCompatMediaItem = getlocalbitmaplambda11;
        if (getlocalbitmaplambda11 != null) {
            getlocalbitmaplambda11.MediaMetadataCompat = getlocalbitmaplambda8;
        }
        IconCompatParcelizer(getlocalbitmaplambda8, getlocalbitmaplambda10);
        getlocalbitmaplambda10.read = getlocalbitmaplambda8;
        getlocalbitmaplambda8.MediaMetadataCompat = getlocalbitmaplambda10;
        int iMax = Math.max(getlocalbitmaplambda9 != null ? getlocalbitmaplambda9.write : 0, getlocalbitmaplambda11 != null ? getlocalbitmaplambda11.write : 0) + 1;
        getlocalbitmaplambda8.write = iMax;
        getlocalbitmaplambda10.write = Math.max(iMax, getlocalbitmaplambda12 != null ? getlocalbitmaplambda12.write : 0) + 1;
    }

    public final void IconCompatParcelizer(getLocalBitmaplambda8 getlocalbitmaplambda8, getLocalBitmaplambda8 getlocalbitmaplambda9) {
        getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda8.MediaMetadataCompat;
        getlocalbitmaplambda8.MediaMetadataCompat = null;
        if (getlocalbitmaplambda9 != null) {
            getlocalbitmaplambda9.MediaMetadataCompat = getlocalbitmaplambda10;
        }
        if (getlocalbitmaplambda10 == null) {
            int i = getlocalbitmaplambda8.serializer;
            getLocalBitmaplambda8[] getlocalbitmaplambda8Arr = this.MediaMetadataCompat;
            getlocalbitmaplambda8Arr[i & (getlocalbitmaplambda8Arr.length - 1)] = getlocalbitmaplambda9;
        } else if (getlocalbitmaplambda10.read == getlocalbitmaplambda8) {
            getlocalbitmaplambda10.read = getlocalbitmaplambda9;
        } else {
            getlocalbitmaplambda10.MediaBrowserCompatMediaItem = getlocalbitmaplambda9;
        }
    }

    public final void RemoteActionCompatParcelizer(getLocalBitmaplambda8 getlocalbitmaplambda8, boolean z) {
        int i;
        if (z) {
            getLocalBitmaplambda8 getlocalbitmaplambda9 = getlocalbitmaplambda8.MediaDescriptionCompat;
            getlocalbitmaplambda9.RemoteActionCompatParcelizer = getlocalbitmaplambda8.RemoteActionCompatParcelizer;
            getlocalbitmaplambda8.RemoteActionCompatParcelizer.MediaDescriptionCompat = getlocalbitmaplambda9;
            getlocalbitmaplambda8.MediaDescriptionCompat = null;
            getlocalbitmaplambda8.RemoteActionCompatParcelizer = null;
        }
        getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda8.read;
        getLocalBitmaplambda8 getlocalbitmaplambda11 = getlocalbitmaplambda8.MediaBrowserCompatMediaItem;
        getLocalBitmaplambda8 getlocalbitmaplambda12 = getlocalbitmaplambda8.MediaMetadataCompat;
        int i2 = 0;
        if (getlocalbitmaplambda10 != null && getlocalbitmaplambda11 != null) {
            if (getlocalbitmaplambda10.write > getlocalbitmaplambda11.write) {
                getLocalBitmaplambda8 getlocalbitmaplambda13 = getlocalbitmaplambda10.MediaBrowserCompatMediaItem;
                while (getlocalbitmaplambda13 != null) {
                    getLocalBitmaplambda8 getlocalbitmaplambda14 = getlocalbitmaplambda13;
                    getlocalbitmaplambda13 = getlocalbitmaplambda13.MediaBrowserCompatMediaItem;
                    getlocalbitmaplambda10 = getlocalbitmaplambda14;
                }
            } else {
                getLocalBitmaplambda8 getlocalbitmaplambda15 = getlocalbitmaplambda11.read;
                while (true) {
                    getLocalBitmaplambda8 getlocalbitmaplambda16 = getlocalbitmaplambda11;
                    getlocalbitmaplambda11 = getlocalbitmaplambda15;
                    getlocalbitmaplambda10 = getlocalbitmaplambda16;
                    if (getlocalbitmaplambda11 == null) {
                        break;
                    } else {
                        getlocalbitmaplambda15 = getlocalbitmaplambda11.read;
                    }
                }
            }
            RemoteActionCompatParcelizer(getlocalbitmaplambda10, false);
            getLocalBitmaplambda8 getlocalbitmaplambda17 = getlocalbitmaplambda8.read;
            if (getlocalbitmaplambda17 != null) {
                i = getlocalbitmaplambda17.write;
                getlocalbitmaplambda10.read = getlocalbitmaplambda17;
                getlocalbitmaplambda17.MediaMetadataCompat = getlocalbitmaplambda10;
                getlocalbitmaplambda8.read = null;
            } else {
                i = 0;
            }
            getLocalBitmaplambda8 getlocalbitmaplambda18 = getlocalbitmaplambda8.MediaBrowserCompatMediaItem;
            if (getlocalbitmaplambda18 != null) {
                i2 = getlocalbitmaplambda18.write;
                getlocalbitmaplambda10.MediaBrowserCompatMediaItem = getlocalbitmaplambda18;
                getlocalbitmaplambda18.MediaMetadataCompat = getlocalbitmaplambda10;
                getlocalbitmaplambda8.MediaBrowserCompatMediaItem = null;
            }
            getlocalbitmaplambda10.write = Math.max(i, i2) + 1;
            IconCompatParcelizer(getlocalbitmaplambda8, getlocalbitmaplambda10);
            return;
        }
        if (getlocalbitmaplambda10 != null) {
            IconCompatParcelizer(getlocalbitmaplambda8, getlocalbitmaplambda10);
            getlocalbitmaplambda8.read = null;
        } else if (getlocalbitmaplambda11 != null) {
            IconCompatParcelizer(getlocalbitmaplambda8, getlocalbitmaplambda11);
            getlocalbitmaplambda8.MediaBrowserCompatMediaItem = null;
        } else {
            IconCompatParcelizer(getlocalbitmaplambda8, (getLocalBitmaplambda8) null);
        }
        serializer(getlocalbitmaplambda12, false);
        this.MediaBrowserCompatMediaItem--;
        this.MediaDescriptionCompat++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.MediaMetadataCompat, (Object) null);
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaDescriptionCompat++;
        getLocalBitmaplambda8 getlocalbitmaplambda8 = this.RemoteActionCompatParcelizer;
        getLocalBitmaplambda8 getlocalbitmaplambda9 = getlocalbitmaplambda8.RemoteActionCompatParcelizer;
        while (getlocalbitmaplambda9 != getlocalbitmaplambda8) {
            getLocalBitmaplambda8 getlocalbitmaplambda10 = getlocalbitmaplambda9.RemoteActionCompatParcelizer;
            getlocalbitmaplambda9.MediaDescriptionCompat = null;
            getlocalbitmaplambda9.RemoteActionCompatParcelizer = null;
            getlocalbitmaplambda9 = getlocalbitmaplambda10;
        }
        getlocalbitmaplambda8.MediaDescriptionCompat = getlocalbitmaplambda8;
        getlocalbitmaplambda8.RemoteActionCompatParcelizer = getlocalbitmaplambda8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer = IconCompatParcelizer(obj, true);
            Object obj3 = getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem;
            getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem = obj2;
            return obj3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("key == null");
        return null;
    }

    public final getLocalBitmaplambda8 IconCompatParcelizer(Object obj, boolean z) {
        getLocalBitmaplambda8 getlocalbitmaplambda8;
        int i;
        getLocalBitmaplambda8 getlocalbitmaplambda9;
        getLocalBitmaplambda8 getlocalbitmaplambda10;
        getLocalBitmaplambda8 getlocalbitmaplambda11;
        getLocalBitmaplambda8 getlocalbitmaplambda12;
        getLocalBitmaplambda8 getlocalbitmaplambda13;
        getLocalBitmaplambda8 getlocalbitmaplambda14;
        int iCompare;
        getLocalBitmaplambda8 getlocalbitmaplambda15;
        getLocalBitmaplambda8[] getlocalbitmaplambda8Arr = this.MediaMetadataCompat;
        int iHashCode = obj.hashCode();
        int i2 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        int length = i3 & (getlocalbitmaplambda8Arr.length - 1);
        getLocalBitmaplambda8 getlocalbitmaplambda16 = getlocalbitmaplambda8Arr[length];
        setIsHtmlInAppMessageHtmlLinkTargetEnabled setishtmlinappmessagehtmllinktargetenabled = write;
        Comparator comparator = this.IconCompatParcelizer;
        getLocalBitmaplambda8 getlocalbitmaplambda17 = null;
        if (getlocalbitmaplambda16 != null) {
            Comparable comparable = comparator == setishtmlinappmessagehtmllinktargetenabled ? (Comparable) obj : null;
            while (true) {
                Object obj2 = getlocalbitmaplambda16.IconCompatParcelizer;
                if (comparable != null) {
                    iCompare = comparable.compareTo(obj2);
                } else {
                    iCompare = comparator.compare(obj, obj2);
                }
                if (iCompare == 0) {
                    return getlocalbitmaplambda16;
                }
                if (iCompare < 0) {
                    getlocalbitmaplambda15 = getlocalbitmaplambda16.read;
                } else {
                    getlocalbitmaplambda15 = getlocalbitmaplambda16.MediaBrowserCompatMediaItem;
                }
                if (getlocalbitmaplambda15 == null) {
                    i = iCompare;
                    getlocalbitmaplambda8 = getlocalbitmaplambda16;
                    break;
                }
                getlocalbitmaplambda16 = getlocalbitmaplambda15;
            }
        } else {
            getlocalbitmaplambda8 = getlocalbitmaplambda16;
            i = 0;
        }
        if (!z) {
            return null;
        }
        getLocalBitmaplambda8 getlocalbitmaplambda18 = this.RemoteActionCompatParcelizer;
        if (getlocalbitmaplambda8 == null) {
            if (comparator == setishtmlinappmessagehtmllinktargetenabled && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            getlocalbitmaplambda9 = new getLocalBitmaplambda8(getlocalbitmaplambda8, obj, i3, getlocalbitmaplambda18, getlocalbitmaplambda18.MediaDescriptionCompat);
            getlocalbitmaplambda8Arr[length] = getlocalbitmaplambda9;
        } else {
            getlocalbitmaplambda9 = new getLocalBitmaplambda8(getlocalbitmaplambda8, obj, i3, getlocalbitmaplambda18, getlocalbitmaplambda18.MediaDescriptionCompat);
            if (i < 0) {
                getlocalbitmaplambda8.read = getlocalbitmaplambda9;
            } else {
                getlocalbitmaplambda8.MediaBrowserCompatMediaItem = getlocalbitmaplambda9;
            }
            serializer(getlocalbitmaplambda8, true);
        }
        int i4 = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = i4 + 1;
        if (i4 > this.RatingCompat) {
            getLocalBitmaplambda8[] getlocalbitmaplambda8Arr2 = this.MediaMetadataCompat;
            int length2 = getlocalbitmaplambda8Arr2.length;
            int i5 = length2 * 2;
            getLocalBitmaplambda8[] getlocalbitmaplambda8Arr3 = new getLocalBitmaplambda8[i5];
            int i6 = 3;
            isActive isactive = new isActive(i6);
            isActive isactive2 = new isActive(i6);
            int i7 = 0;
            getLocalBitmaplambda8 getlocalbitmaplambda19 = null;
            while (i7 < length2) {
                getLocalBitmaplambda8 getlocalbitmaplambda20 = getlocalbitmaplambda8Arr2[i7];
                if (getlocalbitmaplambda20 == null) {
                    getLocalBitmaplambda8 getlocalbitmaplambda21 = getlocalbitmaplambda17;
                    getlocalbitmaplambda13 = getlocalbitmaplambda19;
                    getlocalbitmaplambda10 = getlocalbitmaplambda21;
                } else {
                    getLocalBitmaplambda8 getlocalbitmaplambda22 = getlocalbitmaplambda19;
                    for (getLocalBitmaplambda8 getlocalbitmaplambda23 = getlocalbitmaplambda20; getlocalbitmaplambda23 != null; getlocalbitmaplambda23 = getlocalbitmaplambda23.read) {
                        getlocalbitmaplambda23.MediaMetadataCompat = getlocalbitmaplambda22;
                        getlocalbitmaplambda22 = getlocalbitmaplambda23;
                    }
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (getlocalbitmaplambda22 != null) {
                            getLocalBitmaplambda8 getlocalbitmaplambda24 = getlocalbitmaplambda22.MediaMetadataCompat;
                            getlocalbitmaplambda22.MediaMetadataCompat = getlocalbitmaplambda19;
                            getLocalBitmaplambda8 getlocalbitmaplambda25 = getlocalbitmaplambda22.MediaBrowserCompatMediaItem;
                            while (true) {
                                getlocalbitmaplambda14 = getlocalbitmaplambda24;
                                getlocalbitmaplambda24 = getlocalbitmaplambda25;
                                if (getlocalbitmaplambda24 == null) {
                                    break;
                                }
                                getlocalbitmaplambda24.MediaMetadataCompat = getlocalbitmaplambda14;
                                getlocalbitmaplambda25 = getlocalbitmaplambda24.read;
                            }
                            getLocalBitmaplambda8 getlocalbitmaplambda26 = getlocalbitmaplambda22;
                            getlocalbitmaplambda22 = getlocalbitmaplambda14;
                            getlocalbitmaplambda19 = getlocalbitmaplambda26;
                        }
                        if (getlocalbitmaplambda19 == null) {
                            break;
                        }
                        if ((getlocalbitmaplambda19.serializer & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                        getlocalbitmaplambda19 = null;
                    }
                    isactive.write = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    isactive.read = 0;
                    isactive.serializer = 0;
                    getLocalBitmaplambda8 getlocalbitmaplambda27 = null;
                    isactive.RemoteActionCompatParcelizer = null;
                    isactive2.write = ((Integer.highestOneBit(i9) * 2) - 1) - i9;
                    isactive2.read = 0;
                    isactive2.serializer = 0;
                    isactive2.RemoteActionCompatParcelizer = null;
                    getLocalBitmaplambda8 getlocalbitmaplambda28 = null;
                    while (getlocalbitmaplambda20 != null) {
                        getlocalbitmaplambda20.MediaMetadataCompat = getlocalbitmaplambda28;
                        getLocalBitmaplambda8 getlocalbitmaplambda29 = getlocalbitmaplambda20;
                        getlocalbitmaplambda20 = getlocalbitmaplambda20.read;
                        getlocalbitmaplambda28 = getlocalbitmaplambda29;
                    }
                    while (true) {
                        if (getlocalbitmaplambda28 != null) {
                            getLocalBitmaplambda8 getlocalbitmaplambda30 = getlocalbitmaplambda28.MediaMetadataCompat;
                            getlocalbitmaplambda28.MediaMetadataCompat = getlocalbitmaplambda27;
                            for (getLocalBitmaplambda8 getlocalbitmaplambda31 = getlocalbitmaplambda28.MediaBrowserCompatMediaItem; getlocalbitmaplambda31 != null; getlocalbitmaplambda31 = getlocalbitmaplambda31.read) {
                                getlocalbitmaplambda31.MediaMetadataCompat = getlocalbitmaplambda30;
                                getlocalbitmaplambda30 = getlocalbitmaplambda31;
                            }
                            getlocalbitmaplambda27 = getlocalbitmaplambda28;
                            getlocalbitmaplambda28 = getlocalbitmaplambda30;
                        }
                        if (getlocalbitmaplambda27 == null) {
                            break;
                        }
                        if ((getlocalbitmaplambda27.serializer & length2) == 0) {
                            isactive.write(getlocalbitmaplambda27);
                        } else {
                            isactive2.write(getlocalbitmaplambda27);
                        }
                        getlocalbitmaplambda27 = null;
                    }
                    if (i8 > 0) {
                        getLocalBitmaplambda8 getlocalbitmaplambda32 = (getLocalBitmaplambda8) isactive.RemoteActionCompatParcelizer;
                        if (getlocalbitmaplambda32.MediaMetadataCompat != null) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                            return null;
                        }
                        getlocalbitmaplambda11 = getlocalbitmaplambda32;
                        getlocalbitmaplambda10 = null;
                    } else {
                        getlocalbitmaplambda10 = null;
                        getlocalbitmaplambda11 = null;
                    }
                    getlocalbitmaplambda8Arr3[i7] = getlocalbitmaplambda11;
                    if (i9 > 0) {
                        getlocalbitmaplambda12 = (getLocalBitmaplambda8) isactive2.RemoteActionCompatParcelizer;
                        if (getlocalbitmaplambda12.MediaMetadataCompat != null) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                            return getlocalbitmaplambda10;
                        }
                    } else {
                        getlocalbitmaplambda12 = getlocalbitmaplambda10;
                    }
                    getlocalbitmaplambda8Arr3[i7 + length2] = getlocalbitmaplambda12;
                    getlocalbitmaplambda13 = getlocalbitmaplambda10;
                }
                i7++;
                getLocalBitmaplambda8 getlocalbitmaplambda33 = getlocalbitmaplambda13;
                getlocalbitmaplambda17 = getlocalbitmaplambda10;
                getlocalbitmaplambda19 = getlocalbitmaplambda33;
            }
            this.MediaMetadataCompat = getlocalbitmaplambda8Arr3;
            this.RatingCompat = (i5 / 4) + (i5 / 2);
        }
        this.MediaDescriptionCompat++;
        return getlocalbitmaplambda9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer;
        if (obj != null) {
            try {
                getlocalbitmaplambda8IconCompatParcelizer = IconCompatParcelizer(obj, false);
            } catch (ClassCastException unused) {
                getlocalbitmaplambda8IconCompatParcelizer = null;
            }
        } else {
            getlocalbitmaplambda8IconCompatParcelizer = null;
        }
        return getlocalbitmaplambda8IconCompatParcelizer != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer;
        if (obj != null) {
            try {
                getlocalbitmaplambda8IconCompatParcelizer = IconCompatParcelizer(obj, false);
            } catch (ClassCastException unused) {
                getlocalbitmaplambda8IconCompatParcelizer = null;
            }
        } else {
            getlocalbitmaplambda8IconCompatParcelizer = null;
        }
        if (getlocalbitmaplambda8IconCompatParcelizer != null) {
            return getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        getLocalBitmaplambda8 getlocalbitmaplambda8IconCompatParcelizer;
        if (obj != null) {
            try {
                getlocalbitmaplambda8IconCompatParcelizer = IconCompatParcelizer(obj, false);
            } catch (ClassCastException unused) {
                getlocalbitmaplambda8IconCompatParcelizer = null;
            }
        } else {
            getlocalbitmaplambda8IconCompatParcelizer = null;
        }
        if (getlocalbitmaplambda8IconCompatParcelizer != null) {
            RemoteActionCompatParcelizer(getlocalbitmaplambda8IconCompatParcelizer, true);
        }
        if (getlocalbitmaplambda8IconCompatParcelizer != null) {
            return getlocalbitmaplambda8IconCompatParcelizer.MediaSessionCompatQueueItem;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        getLocalBitmaplambda5 getlocalbitmaplambda5 = this.serializer;
        if (getlocalbitmaplambda5 != null) {
            return getlocalbitmaplambda5;
        }
        getLocalBitmaplambda5 getlocalbitmaplambda6 = new getLocalBitmaplambda5(this, 1);
        this.serializer = getlocalbitmaplambda6;
        return getlocalbitmaplambda6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        getLocalBitmaplambda5 getlocalbitmaplambda5 = this.read;
        if (getlocalbitmaplambda5 != null) {
            return getlocalbitmaplambda5;
        }
        getLocalBitmaplambda5 getlocalbitmaplambda6 = new getLocalBitmaplambda5(this, 0);
        this.read = getlocalbitmaplambda6;
        return getlocalbitmaplambda6;
    }
}
