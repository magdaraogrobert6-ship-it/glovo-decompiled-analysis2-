package o;

import androidx.cardview.widget.CardView$1;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class DrawWithContentElement {
    public static boolean write = false;
    public drawWithContent PlaybackStateCompatCustomAction;
    public final getOnBuildDrawCache RemoteActionCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor read;
    public int MediaSessionCompatQueueItem = 1000;
    public boolean serializer = false;
    public int ResultReceiver = 0;
    public int ParcelableVolumeInfo = 32;
    public int MediaMetadataCompat = 32;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
    public boolean[] IconCompatParcelizer = new boolean[32];
    public int RatingCompat = 1;
    public int MediaDescriptionCompat = 0;
    public int MediaBrowserCompatMediaItem = 32;
    public setBlockui[] MediaSessionCompatResultReceiverWrapper = new setBlockui[1000];
    public int MediaSessionCompatToken = 0;
    public drawWithContent[] PlaybackStateCompat = new drawWithContent[32];

    public final void RatingCompat() {
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            drawWithContent drawwithcontent = this.PlaybackStateCompat[i];
            if (drawwithcontent != null) {
                ((FocusOwnerImplWhenMappings) this.read.serializer).read(drawwithcontent);
            }
            this.PlaybackStateCompat[i] = null;
        }
    }

    public final void read() {
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            drawWithContent drawwithcontent = this.PlaybackStateCompat[i];
            drawwithcontent.serializer.IconCompatParcelizer = drawwithcontent.read;
        }
    }

    public static int serializer(Object obj) {
        setBlockui setblockui = ((paintdefault) obj).MediaMetadataCompat;
        if (setblockui != null) {
            return (int) (setblockui.IconCompatParcelizer + 0.5f);
        }
        return 0;
    }

    public final setBlockui IconCompatParcelizer(DrawWithCacheElement drawWithCacheElement) {
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) this.read.read;
        int i = focusOwnerImplWhenMappings.serializer;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = focusOwnerImplWhenMappings.write;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            focusOwnerImplWhenMappings.serializer = i2;
            obj = obj2;
        }
        setBlockui setblockui = (setBlockui) obj;
        if (setblockui == null) {
            setblockui = new setBlockui(drawWithCacheElement);
            setblockui.MediaBrowserCompatMediaItem = drawWithCacheElement;
        } else {
            setblockui.RemoteActionCompatParcelizer();
            setblockui.MediaBrowserCompatMediaItem = drawWithCacheElement;
        }
        int i3 = this.MediaSessionCompatToken;
        int i4 = this.MediaSessionCompatQueueItem;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.MediaSessionCompatQueueItem = i5;
            this.MediaSessionCompatResultReceiverWrapper = (setBlockui[]) Arrays.copyOf(this.MediaSessionCompatResultReceiverWrapper, i5);
        }
        setBlockui[] setblockuiArr = this.MediaSessionCompatResultReceiverWrapper;
        int i6 = this.MediaSessionCompatToken;
        this.MediaSessionCompatToken = i6 + 1;
        setblockuiArr[i6] = setblockui;
        return setblockui;
    }

    public final void MediaMetadataCompat() {
        androidx.emoji2.text.EmojiProcessor emojiProcessor;
        int i = 0;
        while (true) {
            emojiProcessor = this.read;
            setBlockui[] setblockuiArr = (setBlockui[]) emojiProcessor.IconCompatParcelizer;
            if (i >= setblockuiArr.length) {
                break;
            }
            setBlockui setblockui = setblockuiArr[i];
            if (setblockui != null) {
                setblockui.RemoteActionCompatParcelizer();
            }
            i++;
        }
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) emojiProcessor.read;
        setBlockui[] setblockuiArr2 = this.MediaSessionCompatResultReceiverWrapper;
        int length = this.MediaSessionCompatToken;
        focusOwnerImplWhenMappings.getClass();
        if (length > setblockuiArr2.length) {
            length = setblockuiArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            setBlockui setblockui2 = setblockuiArr2[i2];
            int i3 = focusOwnerImplWhenMappings.serializer;
            Object[] objArr = focusOwnerImplWhenMappings.write;
            if (i3 < objArr.length) {
                objArr[i3] = setblockui2;
                focusOwnerImplWhenMappings.serializer = i3 + 1;
            }
        }
        this.MediaSessionCompatToken = 0;
        Arrays.fill((setBlockui[]) emojiProcessor.IconCompatParcelizer, (Object) null);
        this.ResultReceiver = 0;
        getOnBuildDrawCache getonbuilddrawcache = this.RemoteActionCompatParcelizer;
        getonbuilddrawcache.MediaSessionCompatQueueItem = 0;
        getonbuilddrawcache.read = 0.0f;
        this.RatingCompat = 1;
        for (int i4 = 0; i4 < this.MediaDescriptionCompat; i4++) {
            drawWithContent drawwithcontent = this.PlaybackStateCompat[i4];
        }
        RatingCompat();
        this.MediaDescriptionCompat = 0;
        this.PlaybackStateCompatCustomAction = new drawWithContent(emojiProcessor);
    }

    public final void RemoteActionCompatParcelizer() {
        getOnBuildDrawCache getonbuilddrawcache = this.RemoteActionCompatParcelizer;
        if (getonbuilddrawcache.IconCompatParcelizer()) {
            read();
            return;
        }
        if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            serializer(getonbuilddrawcache);
            return;
        }
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            if (!this.PlaybackStateCompat[i].write) {
                serializer(getonbuilddrawcache);
                return;
            }
        }
        read();
    }

    public final drawWithContent serializer() {
        Object obj;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.read;
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) emojiProcessor.serializer;
        int i = focusOwnerImplWhenMappings.serializer;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = focusOwnerImplWhenMappings.write;
            obj = objArr[i2];
            objArr[i2] = null;
            focusOwnerImplWhenMappings.serializer = i2;
        } else {
            obj = null;
        }
        drawWithContent drawwithcontent = (drawWithContent) obj;
        if (drawwithcontent == null) {
            return new drawWithContent(emojiProcessor);
        }
        drawwithcontent.serializer = null;
        drawwithcontent.RemoteActionCompatParcelizer.IconCompatParcelizer();
        drawwithcontent.read = 0.0f;
        drawwithcontent.write = false;
        return drawwithcontent;
    }

    public final void serializer(getOnBuildDrawCache getonbuilddrawcache) {
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            drawWithContent drawwithcontent = this.PlaybackStateCompat[i];
            if (drawwithcontent.serializer.MediaBrowserCompatMediaItem != DrawWithCacheElement.UNRESTRICTED) {
                float f = 0.0f;
                if (drawwithcontent.read < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.MediaDescriptionCompat) {
                            drawWithContent drawwithcontent2 = this.PlaybackStateCompat[i5];
                            if (drawwithcontent2.serializer.MediaBrowserCompatMediaItem != DrawWithCacheElement.UNRESTRICTED && !drawwithcontent2.write && drawwithcontent2.read < f) {
                                int iRemoteActionCompatParcelizer = drawwithcontent2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                                int i7 = 0;
                                while (i7 < iRemoteActionCompatParcelizer) {
                                    setBlockui setblockuiSerializer = drawwithcontent2.RemoteActionCompatParcelizer.serializer(i7);
                                    float fWrite = drawwithcontent2.RemoteActionCompatParcelizer.write(setblockuiSerializer);
                                    if (fWrite > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = setblockuiSerializer.MediaMetadataCompat[i8] / fWrite;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i4 = setblockuiSerializer.serializer;
                                                i6 = i8;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            drawWithContent drawwithcontent3 = this.PlaybackStateCompat[i3];
                            drawwithcontent3.serializer.MediaSessionCompatQueueItem = -1;
                            drawwithcontent3.read(((setBlockui[]) this.read.IconCompatParcelizer)[i4]);
                            setBlockui setblockui = drawwithcontent3.serializer;
                            setblockui.MediaSessionCompatQueueItem = i3;
                            setblockui.serializer(this, drawwithcontent3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.RatingCompat / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        RemoteActionCompatParcelizer(getonbuilddrawcache);
        read();
    }

    public final setBlockui write(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.RatingCompat + 1 >= this.MediaMetadataCompat) {
            write();
        }
        if (!(obj instanceof paintdefault)) {
            return null;
        }
        paintdefault paintdefaultVar = (paintdefault) obj;
        setBlockui setblockui = paintdefaultVar.MediaMetadataCompat;
        if (setblockui == null) {
            paintdefaultVar.MediaBrowserCompatMediaItem();
            setblockui = paintdefaultVar.MediaMetadataCompat;
        }
        int i = setblockui.serializer;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.read;
        if (i != -1 && i <= this.ResultReceiver && ((setBlockui[]) emojiProcessor.IconCompatParcelizer)[i] != null) {
            return setblockui;
        }
        if (i != -1) {
            setblockui.RemoteActionCompatParcelizer();
        }
        int i2 = this.ResultReceiver + 1;
        this.ResultReceiver = i2;
        this.RatingCompat++;
        setblockui.serializer = i2;
        setblockui.MediaBrowserCompatMediaItem = DrawWithCacheElement.UNRESTRICTED;
        ((setBlockui[]) emojiProcessor.IconCompatParcelizer)[i2] = setblockui;
        return setblockui;
    }

    public final setBlockui IconCompatParcelizer() {
        if (this.RatingCompat + 1 >= this.MediaMetadataCompat) {
            write();
        }
        setBlockui setblockuiIconCompatParcelizer = IconCompatParcelizer(DrawWithCacheElement.SLACK);
        int i = this.ResultReceiver + 1;
        this.ResultReceiver = i;
        this.RatingCompat++;
        setblockuiIconCompatParcelizer.serializer = i;
        ((setBlockui[]) this.read.IconCompatParcelizer)[i] = setblockuiIconCompatParcelizer;
        return setblockuiIconCompatParcelizer;
    }

    public final setBlockui IconCompatParcelizer(int i) {
        if (this.RatingCompat + 1 >= this.MediaMetadataCompat) {
            write();
        }
        setBlockui setblockuiIconCompatParcelizer = IconCompatParcelizer(DrawWithCacheElement.ERROR);
        float[] fArr = setblockuiIconCompatParcelizer.RatingCompat;
        int i2 = this.ResultReceiver + 1;
        this.ResultReceiver = i2;
        this.RatingCompat++;
        setblockuiIconCompatParcelizer.serializer = i2;
        setblockuiIconCompatParcelizer.PlaybackStateCompatCustomAction = i;
        ((setBlockui[]) this.read.IconCompatParcelizer)[i2] = setblockuiIconCompatParcelizer;
        getOnBuildDrawCache getonbuilddrawcache = this.RemoteActionCompatParcelizer;
        getonbuilddrawcache.MediaDescriptionCompat.RemoteActionCompatParcelizer = setblockuiIconCompatParcelizer;
        Arrays.fill(fArr, 0.0f);
        fArr[setblockuiIconCompatParcelizer.PlaybackStateCompatCustomAction] = 1.0f;
        getonbuilddrawcache.serializer(setblockuiIconCompatParcelizer);
        return setblockuiIconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(setBlockui setblockui, setBlockui setblockui2, int i, int i2) {
        drawWithContent drawwithcontentSerializer = serializer();
        setBlockui setblockuiIconCompatParcelizer = IconCompatParcelizer();
        setblockuiIconCompatParcelizer.PlaybackStateCompatCustomAction = 0;
        drawwithcontentSerializer.serializer(setblockui, setblockui2, setblockuiIconCompatParcelizer, i);
        if (i2 != 8) {
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer(i2), (int) (drawwithcontentSerializer.RemoteActionCompatParcelizer.write(setblockuiIconCompatParcelizer) * (-1.0f)));
        }
        write(drawwithcontentSerializer);
    }

    public final void serializer(drawWithContent drawwithcontent) {
        int i;
        if (drawwithcontent.write) {
            drawwithcontent.serializer.RemoteActionCompatParcelizer(this, drawwithcontent.read);
        } else {
            drawWithContent[] drawwithcontentArr = this.PlaybackStateCompat;
            int i2 = this.MediaDescriptionCompat;
            drawwithcontentArr[i2] = drawwithcontent;
            setBlockui setblockui = drawwithcontent.serializer;
            setblockui.MediaSessionCompatQueueItem = i2;
            this.MediaDescriptionCompat = i2 + 1;
            setblockui.serializer(this, drawwithcontent);
        }
        if (this.serializer) {
            int i3 = 0;
            while (i3 < this.MediaDescriptionCompat) {
                if (this.PlaybackStateCompat[i3] == null) {
                    System.out.println("WTF");
                }
                drawWithContent drawwithcontent2 = this.PlaybackStateCompat[i3];
                if (drawwithcontent2 != null && drawwithcontent2.write) {
                    drawwithcontent2.serializer.RemoteActionCompatParcelizer(this, drawwithcontent2.read);
                    ((FocusOwnerImplWhenMappings) this.read.serializer).read(drawwithcontent2);
                    this.PlaybackStateCompat[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.MediaDescriptionCompat;
                        if (i4 >= i) {
                            break;
                        }
                        drawWithContent[] drawwithcontentArr2 = this.PlaybackStateCompat;
                        int i6 = i4 - 1;
                        drawWithContent drawwithcontent3 = drawwithcontentArr2[i4];
                        drawwithcontentArr2[i6] = drawwithcontent3;
                        setBlockui setblockui2 = drawwithcontent3.serializer;
                        if (setblockui2.MediaSessionCompatQueueItem == i4) {
                            setblockui2.MediaSessionCompatQueueItem = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.PlaybackStateCompat[i5] = null;
                    }
                    this.MediaDescriptionCompat = i - 1;
                    i3--;
                }
                i3++;
            }
            this.serializer = false;
        }
    }

    public final void write() {
        int i = this.ParcelableVolumeInfo * 2;
        this.ParcelableVolumeInfo = i;
        this.PlaybackStateCompat = (drawWithContent[]) Arrays.copyOf(this.PlaybackStateCompat, i);
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.read;
        emojiProcessor.IconCompatParcelizer = (setBlockui[]) Arrays.copyOf((setBlockui[]) emojiProcessor.IconCompatParcelizer, this.ParcelableVolumeInfo);
        int i2 = this.ParcelableVolumeInfo;
        this.IconCompatParcelizer = new boolean[i2];
        this.MediaMetadataCompat = i2;
        this.MediaBrowserCompatMediaItem = i2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    public final void write(drawWithContent drawwithcontent) {
        boolean z;
        setBlockui setblockuiIconCompatParcelizer;
        boolean z2 = true;
        if (this.MediaDescriptionCompat + 1 < this.MediaBrowserCompatMediaItem) {
            if (this.RatingCompat + 1 >= this.MediaMetadataCompat) {
                write();
            }
        } else {
            write();
        }
        if (!drawwithcontent.write) {
            ArrayList arrayList = drawwithcontent.IconCompatParcelizer;
            if (this.PlaybackStateCompat.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iRemoteActionCompatParcelizer = drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
                        setBlockui setblockuiSerializer = drawwithcontent.RemoteActionCompatParcelizer.serializer(i);
                        if (setblockuiSerializer.MediaSessionCompatQueueItem != -1 || setblockuiSerializer.read) {
                            arrayList.add(setblockuiSerializer);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            setBlockui setblockui = (setBlockui) arrayList.get(i2);
                            if (setblockui.read) {
                                drawwithcontent.RemoteActionCompatParcelizer(this, setblockui, true);
                            } else {
                                drawwithcontent.serializer(this, this.PlaybackStateCompat[setblockui.MediaSessionCompatQueueItem], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (drawwithcontent.serializer != null && drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
                    drawwithcontent.write = true;
                    this.serializer = true;
                }
            }
            if (drawwithcontent.IconCompatParcelizer()) {
                return;
            }
            float f = drawwithcontent.read;
            if (f < 0.0f) {
                drawwithcontent.read = f * (-1.0f);
                DrawResult drawResult = drawwithcontent.RemoteActionCompatParcelizer;
                int i3 = drawResult.MediaMetadataCompat;
                for (int i4 = 0; i3 != -1 && i4 < drawResult.write; i4++) {
                    float[] fArr = drawResult.read;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = drawResult.IconCompatParcelizer[i3];
                }
            }
            int iRemoteActionCompatParcelizer2 = drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            float f2 = 0.0f;
            float f3 = 0.0f;
            setBlockui setblockui2 = null;
            setBlockui setblockui3 = null;
            boolean z4 = false;
            boolean z5 = false;
            for (int i5 = 0; i5 < iRemoteActionCompatParcelizer2; i5++) {
                float fRemoteActionCompatParcelizer = drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i5);
                setBlockui setblockuiSerializer2 = drawwithcontent.RemoteActionCompatParcelizer.serializer(i5);
                if (setblockuiSerializer2.MediaBrowserCompatMediaItem == DrawWithCacheElement.UNRESTRICTED) {
                    if (setblockui2 == null) {
                        if (setblockuiSerializer2.ParcelableVolumeInfo <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        setblockui2 = setblockuiSerializer2;
                        f2 = fRemoteActionCompatParcelizer;
                    } else {
                        if (f2 > fRemoteActionCompatParcelizer) {
                            if (setblockuiSerializer2.ParcelableVolumeInfo > 1) {
                                z4 = false;
                            }
                            setblockui2 = setblockuiSerializer2;
                            f2 = fRemoteActionCompatParcelizer;
                        } else if (z4 || setblockuiSerializer2.ParcelableVolumeInfo > 1) {
                        }
                        z4 = true;
                        setblockui2 = setblockuiSerializer2;
                        f2 = fRemoteActionCompatParcelizer;
                    }
                } else if (setblockui2 == null && fRemoteActionCompatParcelizer < 0.0f) {
                    if (setblockui3 == null) {
                        if (setblockuiSerializer2.ParcelableVolumeInfo <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        setblockui3 = setblockuiSerializer2;
                        f3 = fRemoteActionCompatParcelizer;
                    } else {
                        if (f3 > fRemoteActionCompatParcelizer) {
                            if (setblockuiSerializer2.ParcelableVolumeInfo > 1) {
                                z5 = false;
                            }
                            setblockui3 = setblockuiSerializer2;
                            f3 = fRemoteActionCompatParcelizer;
                        } else if (z5 || setblockuiSerializer2.ParcelableVolumeInfo > 1) {
                        }
                        z5 = true;
                        setblockui3 = setblockuiSerializer2;
                        f3 = fRemoteActionCompatParcelizer;
                    }
                }
            }
            if (setblockui2 == null) {
                setblockui2 = setblockui3;
            }
            if (setblockui2 == null) {
                z = true;
            } else {
                drawwithcontent.read(setblockui2);
                z = false;
            }
            if (drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
                drawwithcontent.write = true;
            }
            if (z) {
                if (this.RatingCompat + 1 >= this.MediaMetadataCompat) {
                    write();
                }
                setBlockui setblockuiIconCompatParcelizer2 = IconCompatParcelizer(DrawWithCacheElement.SLACK);
                int i6 = this.ResultReceiver + 1;
                this.ResultReceiver = i6;
                this.RatingCompat++;
                setblockuiIconCompatParcelizer2.serializer = i6;
                androidx.emoji2.text.EmojiProcessor emojiProcessor = this.read;
                ((setBlockui[]) emojiProcessor.IconCompatParcelizer)[i6] = setblockuiIconCompatParcelizer2;
                drawwithcontent.serializer = setblockuiIconCompatParcelizer2;
                int i7 = this.MediaDescriptionCompat;
                serializer(drawwithcontent);
                if (this.MediaDescriptionCompat == i7 + 1) {
                    drawWithContent drawwithcontent2 = this.PlaybackStateCompatCustomAction;
                    drawwithcontent2.serializer = null;
                    drawwithcontent2.RemoteActionCompatParcelizer.IconCompatParcelizer();
                    for (int i8 = 0; i8 < drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(); i8++) {
                        drawwithcontent2.RemoteActionCompatParcelizer.write(drawwithcontent.RemoteActionCompatParcelizer.serializer(i8), drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i8), true);
                    }
                    RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
                    if (setblockuiIconCompatParcelizer2.MediaSessionCompatQueueItem == -1) {
                        if (drawwithcontent.serializer == setblockuiIconCompatParcelizer2 && (setblockuiIconCompatParcelizer = drawwithcontent.IconCompatParcelizer(null, setblockuiIconCompatParcelizer2)) != null) {
                            drawwithcontent.read(setblockuiIconCompatParcelizer);
                        }
                        if (!drawwithcontent.write) {
                            drawwithcontent.serializer.serializer(this, drawwithcontent);
                        }
                        ((FocusOwnerImplWhenMappings) emojiProcessor.serializer).read(drawwithcontent);
                        this.MediaDescriptionCompat--;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            setBlockui setblockui4 = drawwithcontent.serializer;
            if (setblockui4 == null) {
                return;
            }
            if ((setblockui4.MediaBrowserCompatMediaItem != DrawWithCacheElement.UNRESTRICTED && drawwithcontent.read < 0.0f) || z2) {
                return;
            }
        }
        serializer(drawwithcontent);
    }

    public final void write(setBlockui setblockui, setBlockui setblockui2, int i, int i2) {
        drawWithContent drawwithcontentSerializer = serializer();
        setBlockui setblockuiIconCompatParcelizer = IconCompatParcelizer();
        setblockuiIconCompatParcelizer.PlaybackStateCompatCustomAction = 0;
        drawwithcontentSerializer.RemoteActionCompatParcelizer(setblockui, setblockui2, setblockuiIconCompatParcelizer, i);
        if (i2 != 8) {
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer(i2), (int) (drawwithcontentSerializer.RemoteActionCompatParcelizer.write(setblockuiIconCompatParcelizer) * (-1.0f)));
        }
        write(drawwithcontentSerializer);
    }

    public DrawWithContentElement() {
        RatingCompat();
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(4, false);
        emojiProcessor.serializer = new FocusOwnerImplWhenMappings();
        emojiProcessor.read = new FocusOwnerImplWhenMappings();
        emojiProcessor.IconCompatParcelizer = new setBlockui[32];
        this.read = emojiProcessor;
        getOnBuildDrawCache getonbuilddrawcache = new getOnBuildDrawCache(emojiProcessor);
        getonbuilddrawcache.MediaBrowserCompatMediaItem = new setBlockui[androidx.compose.ui.graphics.Fields.SpotShadowColor];
        getonbuilddrawcache.MediaSessionCompatQueueItem = 0;
        getonbuilddrawcache.MediaDescriptionCompat = new CardView$1(6, getonbuilddrawcache);
        this.RemoteActionCompatParcelizer = getonbuilddrawcache;
        this.PlaybackStateCompatCustomAction = new drawWithContent(emojiProcessor);
    }

    public final void RemoteActionCompatParcelizer(drawWithContent drawwithcontent) {
        DrawResult drawResult;
        int i;
        for (int i2 = 0; i2 < this.RatingCompat; i2++) {
            this.IconCompatParcelizer[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.RatingCompat * 2) {
                return;
            }
            setBlockui setblockui = drawwithcontent.serializer;
            if (setblockui != null) {
                this.IconCompatParcelizer[setblockui.serializer] = true;
            }
            setBlockui setblockuiWrite = drawwithcontent.write(this.IconCompatParcelizer);
            if (setblockuiWrite != null) {
                boolean[] zArr = this.IconCompatParcelizer;
                int i4 = setblockuiWrite.serializer;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (setblockuiWrite != null) {
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.MediaDescriptionCompat; i6++) {
                    drawWithContent drawwithcontent2 = this.PlaybackStateCompat[i6];
                    if (drawwithcontent2.serializer.MediaBrowserCompatMediaItem != DrawWithCacheElement.UNRESTRICTED && !drawwithcontent2.write && (i = (drawResult = drawwithcontent2.RemoteActionCompatParcelizer).MediaMetadataCompat) != -1) {
                        for (int i7 = 0; i != -1 && i7 < drawResult.write; i7++) {
                            if (drawResult.serializer[i] != setblockuiWrite.serializer) {
                                i = drawResult.IconCompatParcelizer[i];
                            } else {
                                float fWrite = drawwithcontent2.RemoteActionCompatParcelizer.write(setblockuiWrite);
                                if (fWrite >= 0.0f) {
                                    break;
                                }
                                float f2 = (-drawwithcontent2.read) / fWrite;
                                if (f2 >= f) {
                                    break;
                                }
                                i5 = i6;
                                f = f2;
                                break;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    drawWithContent drawwithcontent3 = this.PlaybackStateCompat[i5];
                    drawwithcontent3.serializer.MediaSessionCompatQueueItem = -1;
                    drawwithcontent3.read(setblockuiWrite);
                    setBlockui setblockui2 = drawwithcontent3.serializer;
                    setblockui2.MediaSessionCompatQueueItem = i5;
                    setblockui2.serializer(this, drawwithcontent3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void read(setBlockui setblockui, int i) {
        int i2 = setblockui.MediaSessionCompatQueueItem;
        if (i2 == -1) {
            setblockui.RemoteActionCompatParcelizer(this, i);
            for (int i3 = 0; i3 < this.ResultReceiver + 1; i3++) {
                setBlockui setblockui2 = ((setBlockui[]) this.read.IconCompatParcelizer)[i3];
            }
            return;
        }
        if (i2 == -1) {
            drawWithContent drawwithcontentSerializer = serializer();
            drawwithcontentSerializer.serializer = setblockui;
            float f = i;
            setblockui.IconCompatParcelizer = f;
            drawwithcontentSerializer.read = f;
            drawwithcontentSerializer.write = true;
            write(drawwithcontentSerializer);
            return;
        }
        drawWithContent drawwithcontent = this.PlaybackStateCompat[i2];
        if (drawwithcontent.write) {
            drawwithcontent.read = i;
            return;
        }
        if (drawwithcontent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 0) {
            drawwithcontent.write = true;
            drawwithcontent.read = i;
            return;
        }
        drawWithContent drawwithcontentSerializer2 = serializer();
        if (i < 0) {
            drawwithcontentSerializer2.read = i * (-1);
            drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui, 1.0f);
        } else {
            drawwithcontentSerializer2.read = i;
            drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui, -1.0f);
        }
        write(drawwithcontentSerializer2);
    }

    public final void IconCompatParcelizer(setBlockui setblockui, setBlockui setblockui2, int i, float f, setBlockui setblockui3, setBlockui setblockui4, int i2, int i3) {
        drawWithContent drawwithcontentSerializer = serializer();
        if (setblockui2 == setblockui3) {
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui, 1.0f);
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui4, 1.0f);
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, -2.0f);
        } else {
            DrawResult drawResult = drawwithcontentSerializer.RemoteActionCompatParcelizer;
            if (f == 0.5f) {
                drawResult.IconCompatParcelizer(setblockui, 1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, -1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui3, -1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui4, 1.0f);
                if (i > 0 || i2 > 0) {
                    drawwithcontentSerializer.read = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                drawResult.IconCompatParcelizer(setblockui, -1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, 1.0f);
                drawwithcontentSerializer.read = i;
            } else if (f >= 1.0f) {
                drawResult.IconCompatParcelizer(setblockui4, -1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui3, 1.0f);
                drawwithcontentSerializer.read = -i2;
            } else {
                float f2 = 1.0f - f;
                drawResult.IconCompatParcelizer(setblockui, f2 * 1.0f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, f2 * (-1.0f));
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui3, (-1.0f) * f);
                drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    drawwithcontentSerializer.read = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            drawwithcontentSerializer.read(this, i3);
        }
        write(drawwithcontentSerializer);
    }

    public final void serializer(setBlockui setblockui, setBlockui setblockui2, int i, int i2) {
        if (i2 == 8 && setblockui2.read && setblockui.MediaSessionCompatQueueItem == -1) {
            setblockui.RemoteActionCompatParcelizer(this, setblockui2.IconCompatParcelizer + i);
            return;
        }
        drawWithContent drawwithcontentSerializer = serializer();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            drawwithcontentSerializer.read = i;
        }
        DrawResult drawResult = drawwithcontentSerializer.RemoteActionCompatParcelizer;
        if (!z) {
            drawResult.IconCompatParcelizer(setblockui, -1.0f);
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, 1.0f);
        } else {
            drawResult.IconCompatParcelizer(setblockui, 1.0f);
            drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockui2, -1.0f);
        }
        if (i2 != 8) {
            drawwithcontentSerializer.read(this, i2);
        }
        write(drawwithcontentSerializer);
    }
}
