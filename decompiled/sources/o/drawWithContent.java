package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class drawWithContent {
    public final DrawResult RemoteActionCompatParcelizer;
    public setBlockui serializer = null;
    public float read = 0.0f;
    public final ArrayList IconCompatParcelizer = new ArrayList();
    public boolean write = false;

    public setBlockui write(boolean[] zArr) {
        return IconCompatParcelizer(zArr, null);
    }

    public final setBlockui IconCompatParcelizer(boolean[] zArr, setBlockui setblockui) {
        DrawWithCacheElement drawWithCacheElement;
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer();
        setBlockui setblockui2 = null;
        float f = 0.0f;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            float fRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer(i);
            if (fRemoteActionCompatParcelizer < 0.0f) {
                setBlockui setblockuiSerializer = drawResult.serializer(i);
                if ((zArr == null || !zArr[setblockuiSerializer.serializer]) && setblockuiSerializer != setblockui && (((drawWithCacheElement = setblockuiSerializer.MediaBrowserCompatMediaItem) == DrawWithCacheElement.SLACK || drawWithCacheElement == DrawWithCacheElement.ERROR) && fRemoteActionCompatParcelizer < f)) {
                    f = fRemoteActionCompatParcelizer;
                    setblockui2 = setblockuiSerializer;
                }
            }
        }
        return setblockui2;
    }

    public void serializer(DrawWithContentElement drawWithContentElement, drawWithContent drawwithcontent, boolean z) {
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        drawResult.getClass();
        float fWrite = drawResult.write(drawwithcontent.serializer);
        drawResult.read(drawwithcontent.serializer, z);
        DrawResult drawResult2 = drawwithcontent.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = drawResult2.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setBlockui setblockuiSerializer = drawResult2.serializer(i);
            drawResult.write(setblockuiSerializer, drawResult2.write(setblockuiSerializer) * fWrite, z);
        }
        this.read = (drawwithcontent.read * fWrite) + this.read;
        if (z) {
            drawwithcontent.serializer.RemoteActionCompatParcelizer(this);
        }
        if (this.serializer == null || drawResult.RemoteActionCompatParcelizer() != 0) {
            return;
        }
        this.write = true;
        drawWithContentElement.serializer = true;
    }

    public final void read(setBlockui setblockui) {
        setBlockui setblockui2 = this.serializer;
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        if (setblockui2 != null) {
            drawResult.IconCompatParcelizer(setblockui2, -1.0f);
            this.serializer.MediaSessionCompatQueueItem = -1;
            this.serializer = null;
        }
        float f = drawResult.read(setblockui, true) * (-1.0f);
        this.serializer = setblockui;
        if (f == 1.0f) {
            return;
        }
        this.read /= f;
        int i = drawResult.MediaMetadataCompat;
        for (int i2 = 0; i != -1 && i2 < drawResult.write; i2++) {
            float[] fArr = drawResult.read;
            fArr[i] = fArr[i] / f;
            i = drawResult.IconCompatParcelizer[i];
        }
    }

    public drawWithContent(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.RemoteActionCompatParcelizer = new DrawResult(this, emojiProcessor);
    }

    public boolean IconCompatParcelizer() {
        return this.serializer == null && this.read == 0.0f && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() == 0;
    }

    public final void RemoteActionCompatParcelizer(DrawWithContentElement drawWithContentElement, setBlockui setblockui, boolean z) {
        if (setblockui.read) {
            DrawResult drawResult = this.RemoteActionCompatParcelizer;
            float fWrite = drawResult.write(setblockui);
            this.read = (setblockui.IconCompatParcelizer * fWrite) + this.read;
            drawResult.read(setblockui, z);
            if (z) {
                setblockui.RemoteActionCompatParcelizer(this);
            }
            if (drawResult.RemoteActionCompatParcelizer() == 0) {
                this.write = true;
                drawWithContentElement.serializer = true;
            }
        }
    }

    public final void read(DrawWithContentElement drawWithContentElement, int i) {
        setBlockui setblockuiIconCompatParcelizer = drawWithContentElement.IconCompatParcelizer(i);
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        drawResult.IconCompatParcelizer(setblockuiIconCompatParcelizer, 1.0f);
        drawResult.IconCompatParcelizer(drawWithContentElement.IconCompatParcelizer(i), -1.0f);
    }

    public String toString() {
        boolean z;
        String strConcat = (this.serializer == null ? "0" : "" + this.serializer).concat(" = ");
        if (this.read != 0.0f) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(strConcat);
            sbM.append(this.read);
            strConcat = sbM.toString();
            z = true;
        } else {
            z = false;
        }
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            setBlockui setblockuiSerializer = drawResult.serializer(i);
            if (setblockuiSerializer != null) {
                float fRemoteActionCompatParcelizer = drawResult.RemoteActionCompatParcelizer(i);
                if (fRemoteActionCompatParcelizer != 0.0f) {
                    String string = setblockuiSerializer.toString();
                    if (z) {
                        if (fRemoteActionCompatParcelizer > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fRemoteActionCompatParcelizer *= -1.0f;
                        }
                    } else if (fRemoteActionCompatParcelizer < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fRemoteActionCompatParcelizer *= -1.0f;
                    }
                    strConcat = fRemoteActionCompatParcelizer == 1.0f ? strConcat.concat(string) : strConcat + fRemoteActionCompatParcelizer + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public final void RemoteActionCompatParcelizer(setBlockui setblockui, setBlockui setblockui2, setBlockui setblockui3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.read = i;
        }
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        if (!z) {
            drawResult.IconCompatParcelizer(setblockui, -1.0f);
            drawResult.IconCompatParcelizer(setblockui2, 1.0f);
            drawResult.IconCompatParcelizer(setblockui3, -1.0f);
        } else {
            drawResult.IconCompatParcelizer(setblockui, 1.0f);
            drawResult.IconCompatParcelizer(setblockui2, -1.0f);
            drawResult.IconCompatParcelizer(setblockui3, 1.0f);
        }
    }

    public final void serializer(setBlockui setblockui, setBlockui setblockui2, setBlockui setblockui3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.read = i;
        }
        DrawResult drawResult = this.RemoteActionCompatParcelizer;
        if (!z) {
            drawResult.IconCompatParcelizer(setblockui, -1.0f);
            drawResult.IconCompatParcelizer(setblockui2, 1.0f);
            drawResult.IconCompatParcelizer(setblockui3, 1.0f);
        } else {
            drawResult.IconCompatParcelizer(setblockui, 1.0f);
            drawResult.IconCompatParcelizer(setblockui2, -1.0f);
            drawResult.IconCompatParcelizer(setblockui3, -1.0f);
        }
    }
}
