package o;

import androidx.cardview.widget.CardView$1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getOnBuildDrawCache extends drawWithContent {
    public setBlockui[] MediaBrowserCompatMediaItem;
    public CardView$1 MediaDescriptionCompat;
    public int MediaSessionCompatQueueItem;

    @Override // o.drawWithContent
    public final boolean IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem == 0;
    }

    public final void write(setBlockui setblockui) {
        int i = 0;
        while (i < this.MediaSessionCompatQueueItem) {
            if (this.MediaBrowserCompatMediaItem[i] == setblockui) {
                while (true) {
                    int i2 = this.MediaSessionCompatQueueItem - 1;
                    if (i >= i2) {
                        this.MediaSessionCompatQueueItem = i2;
                        setblockui.RemoteActionCompatParcelizer = false;
                        return;
                    } else {
                        setBlockui[] setblockuiArr = this.MediaBrowserCompatMediaItem;
                        int i3 = i + 1;
                        setblockuiArr[i] = setblockuiArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o.drawWithContent
    public final setBlockui write(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.MediaSessionCompatQueueItem; i2++) {
            setBlockui[] setblockuiArr = this.MediaBrowserCompatMediaItem;
            setBlockui setblockui = setblockuiArr[i2];
            if (!zArr[setblockui.serializer]) {
                CardView$1 cardView$1 = this.MediaDescriptionCompat;
                cardView$1.RemoteActionCompatParcelizer = setblockui;
                int i3 = 8;
                if (i != -1) {
                    setBlockui setblockui2 = setblockuiArr[i];
                    while (i3 >= 0) {
                        float f = setblockui2.RatingCompat[i3];
                        float f2 = ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.MediaBrowserCompatMediaItem[i];
    }

    @Override // o.drawWithContent
    public final void serializer(DrawWithContentElement drawWithContentElement, drawWithContent drawwithcontent, boolean z) {
        setBlockui setblockui = drawwithcontent.serializer;
        if (setblockui == null) {
            return;
        }
        float[] fArr = setblockui.RatingCompat;
        DrawResult drawResult = drawwithcontent.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setBlockui setblockuiSerializer = drawResult.serializer(i);
            float fRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer(i);
            CardView$1 cardView$1 = this.MediaDescriptionCompat;
            cardView$1.RemoteActionCompatParcelizer = setblockuiSerializer;
            if (setblockuiSerializer.RemoteActionCompatParcelizer) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat;
                    float f = (fArr[i2] * fRemoteActionCompatParcelizer) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((getOnBuildDrawCache) cardView$1.IconCompatParcelizer).write((setBlockui) cardView$1.RemoteActionCompatParcelizer);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fRemoteActionCompatParcelizer;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat[i3] = f3;
                    } else {
                        ((setBlockui) cardView$1.RemoteActionCompatParcelizer).RatingCompat[i3] = 0.0f;
                    }
                }
                serializer(setblockuiSerializer);
            }
            this.read = (drawwithcontent.read * fRemoteActionCompatParcelizer) + this.read;
        }
        write(setblockui);
    }

    public final void serializer(setBlockui setblockui) {
        int i = this.MediaSessionCompatQueueItem;
        setBlockui[] setblockuiArr = this.MediaBrowserCompatMediaItem;
        if (i + 1 > setblockuiArr.length) {
            setBlockui[] setblockuiArr2 = (setBlockui[]) Arrays.copyOf(setblockuiArr, setblockuiArr.length * 2);
            this.MediaBrowserCompatMediaItem = setblockuiArr2;
        }
        setBlockui[] setblockuiArr3 = this.MediaBrowserCompatMediaItem;
        int i2 = this.MediaSessionCompatQueueItem;
        setblockuiArr3[i2] = setblockui;
        int i3 = i2 + 1;
        this.MediaSessionCompatQueueItem = i3;
        if (i3 > 1) {
            int i4 = setblockui.serializer;
        }
        setblockui.RemoteActionCompatParcelizer = true;
        setblockui.serializer(this);
    }

    @Override // o.drawWithContent
    public final String toString() {
        CardView$1 cardView$1 = this.MediaDescriptionCompat;
        String str = " goal -> (" + this.read + ") : ";
        for (int i = 0; i < this.MediaSessionCompatQueueItem; i++) {
            cardView$1.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem[i];
            str = str + cardView$1 + " ";
        }
        return str;
    }

    public getOnBuildDrawCache(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        super(emojiProcessor);
    }
}
