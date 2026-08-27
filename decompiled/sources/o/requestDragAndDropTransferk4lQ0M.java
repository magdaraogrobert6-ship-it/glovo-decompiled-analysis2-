package o;

import java.util.Arrays;
import kotlin.ranges.RangesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class requestDragAndDropTransferk4lQ0M {
    public static final requestDragAndDropTransferk4lQ0M IconCompatParcelizer = new requestDragAndDropTransferk4lQ0M(0, 0, new Object[0], null);
    public final DragAndDropNodeonEnded1 RemoteActionCompatParcelizer;
    public Object[] read;
    public int serializer;
    public int write;

    public final requestDragAndDropTransferk4lQ0M IconCompatParcelizer(int i, Object obj, Object obj2, int i2, onEntered onentered) {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mIconCompatParcelizer;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m;
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        if (RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            Object[] objArr = {obj, this.read[iIconCompatParcelizer]};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {obj2, MediaSessionCompatQueueItem(iIconCompatParcelizer)};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return serializer(iIconCompatParcelizer, iRemoteActionCompatParcelizer, onentered);
                }
            }
        } else if (write(iRemoteActionCompatParcelizer)) {
            int i3 = read(iRemoteActionCompatParcelizer);
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(i3);
            if (i2 == 30) {
                Object[] objArr3 = {0, Integer.valueOf(requestdraganddroptransferk4lq0mSerializer.read.length)};
                int iWrite = BackspaceCommand.write();
                getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr3, BackspaceCommand.write(), -281231677, iWrite));
                int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
                int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
                int i6 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        Object[] objArr4 = {obj, requestdraganddroptransferk4lq0mSerializer.read[i4]};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                            Object[] objArr5 = {obj2, requestdraganddroptransferk4lq0mSerializer.MediaSessionCompatQueueItem(i4)};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                requestdraganddroptransferk4lq0mIconCompatParcelizer = requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer(i4, onentered);
                            }
                        }
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                }
                requestdraganddroptransferk4lq0m = requestdraganddroptransferk4lq0mSerializer;
                return read(requestdraganddroptransferk4lq0mSerializer, requestdraganddroptransferk4lq0m, i3, iRemoteActionCompatParcelizer, onentered.IconCompatParcelizer);
            }
            requestdraganddroptransferk4lq0mIconCompatParcelizer = requestdraganddroptransferk4lq0mSerializer.IconCompatParcelizer(i, obj, obj2, i2 + 5, onentered);
            requestdraganddroptransferk4lq0m = requestdraganddroptransferk4lq0mIconCompatParcelizer;
            return read(requestdraganddroptransferk4lq0mSerializer, requestdraganddroptransferk4lq0m, i3, iRemoteActionCompatParcelizer, onentered.IconCompatParcelizer);
        }
        return this;
    }

    public final boolean IconCompatParcelizer(int i, int i2, Object obj) {
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        if (RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[IconCompatParcelizer(iRemoteActionCompatParcelizer)]}, getCieXyz.write())).booleanValue();
        }
        if (!write(iRemoteActionCompatParcelizer)) {
            return false;
        }
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(read(iRemoteActionCompatParcelizer));
        return i2 == 30 ? requestdraganddroptransferk4lq0mSerializer.write(obj) : requestdraganddroptransferk4lq0mSerializer.IconCompatParcelizer(i, i2 + 5, obj);
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        return (i & this.serializer) != 0;
    }

    public final Object serializer(int i, int i2, Object obj) {
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        if (RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            Object[] objArr = {obj, this.read[iIconCompatParcelizer]};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return MediaSessionCompatQueueItem(iIconCompatParcelizer);
            }
            return null;
        }
        if (!write(iRemoteActionCompatParcelizer)) {
            return null;
        }
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(read(iRemoteActionCompatParcelizer));
        if (i2 != 30) {
            return requestdraganddroptransferk4lq0mSerializer.serializer(i, i2 + 5, obj);
        }
        Object[] objArr2 = {0, Integer.valueOf(requestdraganddroptransferk4lq0mSerializer.read.length)};
        int iWrite = BackspaceCommand.write();
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -281231677, iWrite));
        int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
        int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
        int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return requestdraganddroptransferk4lq0mSerializer.MediaSessionCompatQueueItem(i3);
    }

    public final boolean write(int i) {
        return (i & this.write) != 0;
    }

    public final requestDragAndDropTransferk4lQ0M IconCompatParcelizer(int i, int i2, requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m) {
        Object[] objArr = requestdraganddroptransferk4lq0m.read;
        if (objArr.length != 2 || requestdraganddroptransferk4lq0m.write != 0) {
            Object[] objArr2 = this.read;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = requestdraganddroptransferk4lq0m;
            return new requestDragAndDropTransferk4lQ0M(this.serializer, this.write, objArrCopyOf, null);
        }
        if (this.read.length == 1) {
            requestdraganddroptransferk4lq0m.serializer = this.write;
            return requestdraganddroptransferk4lq0m;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(i2);
        Object[] objArr3 = this.read;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        onContentCardClicked.write(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        onContentCardClicked.write(iIconCompatParcelizer + 2, iIconCompatParcelizer, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iIconCompatParcelizer] = obj;
        objArrCopyOf2[iIconCompatParcelizer + 1] = obj2;
        return new requestDragAndDropTransferk4lQ0M(this.serializer ^ i2, i2 ^ this.write, objArrCopyOf2, null);
    }

    public final requestDragAndDropTransferk4lQ0M IconCompatParcelizer(int i, requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, DragAndDropNodeonEnded1 dragAndDropNodeonEnded1) {
        Object[] objArr = this.read;
        if (objArr.length == 1 && requestdraganddroptransferk4lq0m.read.length == 2 && requestdraganddroptransferk4lq0m.write == 0) {
            requestdraganddroptransferk4lq0m.serializer = this.write;
            return requestdraganddroptransferk4lq0m;
        }
        if (this.RemoteActionCompatParcelizer == dragAndDropNodeonEnded1) {
            objArr[i] = requestdraganddroptransferk4lq0m;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = requestdraganddroptransferk4lq0m;
        return new requestDragAndDropTransferk4lQ0M(this.serializer, this.write, objArrCopyOf, dragAndDropNodeonEnded1);
    }

    public final int read(int i) {
        return (this.read.length - 1) - Integer.bitCount((i - 1) & this.write);
    }

    public final requestDragAndDropTransferk4lQ0M serializer(int i) {
        Object obj = this.read[i];
        obj.getClass();
        return (requestDragAndDropTransferk4lQ0M) obj;
    }

    public final Object[] serializer(int i, int i2, int i3, Object obj, Object obj2, int i4, DragAndDropNodeonEnded1 dragAndDropNodeonEnded1) {
        Object obj3 = this.read[i];
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = read(obj3 != null ? obj3.hashCode() : 0, obj3, MediaSessionCompatQueueItem(i), i3, obj, obj2, i4 + 5, dragAndDropNodeonEnded1);
        int i5 = read(i2);
        int i6 = i5 + 1;
        Object[] objArr = this.read;
        Object[] objArr2 = new Object[objArr.length - 1];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i, i + 2, i6, objArr, objArr2);
        objArr2[i5 - 1] = requestdraganddroptransferk4lq0m;
        onContentCardClicked.write(i5, i6, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final boolean write(Object obj) {
        Object[] objArr = {0, Integer.valueOf(this.read.length)};
        int iWrite = BackspaceCommand.write();
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite));
        int i = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
        int i2 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
        int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public requestDragAndDropTransferk4lQ0M(int i, int i2, Object[] objArr, DragAndDropNodeonEnded1 dragAndDropNodeonEnded1) {
        this.serializer = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = dragAndDropNodeonEnded1;
        this.read = objArr;
    }

    public final boolean write(requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m) {
        if (this == requestdraganddroptransferk4lq0m) {
            return true;
        }
        if (this.write == requestdraganddroptransferk4lq0m.write && this.serializer == requestdraganddroptransferk4lq0m.serializer) {
            int length = this.read.length;
            for (int i = 0; i < length; i++) {
                if (this.read[i] == requestdraganddroptransferk4lq0m.read[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object MediaSessionCompatQueueItem(int i) {
        return this.read[i + 1];
    }

    public final requestDragAndDropTransferk4lQ0M RemoteActionCompatParcelizer(int i, onEntered onentered) {
        onentered.write(onentered.RatingCompat - 1);
        onentered.write = MediaSessionCompatQueueItem(i);
        Object[] objArr = this.read;
        if (objArr.length == 2) {
            return null;
        }
        if (this.RemoteActionCompatParcelizer != onentered.IconCompatParcelizer) {
            return new requestDragAndDropTransferk4lQ0M(0, 0, ModuleDSLKt.IconCompatParcelizer(i, objArr), onentered.IconCompatParcelizer);
        }
        this.read = ModuleDSLKt.IconCompatParcelizer(i, objArr);
        return this;
    }

    public final int read() {
        if (this.write == 0) {
            return this.read.length / 2;
        }
        int iBitCount = Integer.bitCount(this.serializer);
        int length = this.read.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += serializer(i).read();
        }
        return iBitCount;
    }

    public final requestDragAndDropTransferk4lQ0M read(requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m2, int i, int i2, DragAndDropNodeonEnded1 dragAndDropNodeonEnded1) {
        DragAndDropNodeonEnded1 dragAndDropNodeonEnded2 = this.RemoteActionCompatParcelizer;
        if (requestdraganddroptransferk4lq0m2 != null) {
            return (dragAndDropNodeonEnded2 == dragAndDropNodeonEnded1 || requestdraganddroptransferk4lq0m != requestdraganddroptransferk4lq0m2) ? IconCompatParcelizer(i, requestdraganddroptransferk4lq0m2, dragAndDropNodeonEnded1) : this;
        }
        Object[] objArr = this.read;
        if (objArr.length == 1) {
            return null;
        }
        if (dragAndDropNodeonEnded2 != dragAndDropNodeonEnded1) {
            return new requestDragAndDropTransferk4lQ0M(this.serializer, this.write ^ i2, ModuleDSLKt.read(i, objArr), dragAndDropNodeonEnded1);
        }
        this.read = ModuleDSLKt.read(i, objArr);
        this.write ^= i2;
        return this;
    }

    public final requestDragAndDropTransferk4lQ0M serializer(int i, int i2, onEntered onentered) {
        onentered.write(onentered.RatingCompat - 1);
        onentered.write = MediaSessionCompatQueueItem(i);
        Object[] objArr = this.read;
        if (objArr.length == 2) {
            return null;
        }
        if (this.RemoteActionCompatParcelizer == onentered.IconCompatParcelizer) {
            this.read = ModuleDSLKt.IconCompatParcelizer(i, objArr);
            this.serializer ^= i2;
            return this;
        }
        return new requestDragAndDropTransferk4lQ0M(i2 ^ this.serializer, this.write, ModuleDSLKt.IconCompatParcelizer(i, objArr), onentered.IconCompatParcelizer);
    }

    public final int IconCompatParcelizer(int i) {
        return Integer.bitCount((i - 1) & this.serializer) * 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0133, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
    
        r2.RemoteActionCompatParcelizer = IconCompatParcelizer(r0, r10, (o.requestDragAndDropTransferk4lQ0M) r2.RemoteActionCompatParcelizer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.CSSParseException RemoteActionCompatParcelizer(int r21, int r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestDragAndDropTransferk4lQ0M.RemoteActionCompatParcelizer(int, int, java.lang.Object, java.lang.Object):o.CSSParseException");
    }

    public final requestDragAndDropTransferk4lQ0M RemoteActionCompatParcelizer(int i, Object obj, Object obj2, int i2, onEntered onentered) {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
        DragAndDropNodeonEnded1 dragAndDropNodeonEnded1 = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[iIconCompatParcelizer]}, getCieXyz.write())).booleanValue()) {
                onentered.write(onentered.RatingCompat + 1);
                DragAndDropNodeonEnded1 dragAndDropNodeonEnded2 = onentered.IconCompatParcelizer;
                if (dragAndDropNodeonEnded1 != dragAndDropNodeonEnded2) {
                    return new requestDragAndDropTransferk4lQ0M(this.serializer ^ iRemoteActionCompatParcelizer, this.write | iRemoteActionCompatParcelizer, serializer(iIconCompatParcelizer, iRemoteActionCompatParcelizer, i, obj, obj2, i2, dragAndDropNodeonEnded2), dragAndDropNodeonEnded2);
                }
                this.read = serializer(iIconCompatParcelizer, iRemoteActionCompatParcelizer, i, obj, obj2, i2, dragAndDropNodeonEnded2);
                this.serializer ^= iRemoteActionCompatParcelizer;
                this.write |= iRemoteActionCompatParcelizer;
                return this;
            }
            onentered.write = MediaSessionCompatQueueItem(iIconCompatParcelizer);
            if (MediaSessionCompatQueueItem(iIconCompatParcelizer) != obj2) {
                if (dragAndDropNodeonEnded1 == onentered.IconCompatParcelizer) {
                    this.read[iIconCompatParcelizer + 1] = obj2;
                    return this;
                }
                onentered.RemoteActionCompatParcelizer++;
                Object[] objArr = this.read;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iIconCompatParcelizer + 1] = obj2;
                return new requestDragAndDropTransferk4lQ0M(this.serializer, this.write, objArrCopyOf, onentered.IconCompatParcelizer);
            }
        } else {
            if (!write(iRemoteActionCompatParcelizer)) {
                onentered.write(onentered.RatingCompat + 1);
                DragAndDropNodeonEnded1 dragAndDropNodeonEnded3 = onentered.IconCompatParcelizer;
                int iIconCompatParcelizer2 = IconCompatParcelizer(iRemoteActionCompatParcelizer);
                Object[] objArr2 = this.read;
                if (dragAndDropNodeonEnded1 == dragAndDropNodeonEnded3) {
                    this.read = ModuleDSLKt.serializer(iIconCompatParcelizer2, obj, obj2, objArr2);
                    this.serializer |= iRemoteActionCompatParcelizer;
                    return this;
                }
                return new requestDragAndDropTransferk4lQ0M(this.serializer | iRemoteActionCompatParcelizer, this.write, ModuleDSLKt.serializer(iIconCompatParcelizer2, obj, obj2, objArr2), dragAndDropNodeonEnded3);
            }
            int i3 = read(iRemoteActionCompatParcelizer);
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(i3);
            if (i2 == 30) {
                getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(requestdraganddroptransferk4lq0mSerializer.read.length)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
                int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
                int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
                int i6 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
                if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                    onentered.write(onentered.RatingCompat + 1);
                    requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer = new requestDragAndDropTransferk4lQ0M(0, 0, ModuleDSLKt.serializer(0, obj, obj2, requestdraganddroptransferk4lq0mSerializer.read), onentered.IconCompatParcelizer);
                } else {
                    while (true) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, requestdraganddroptransferk4lq0mSerializer.read[i4]}, getCieXyz.write())).booleanValue()) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            onentered.write = requestdraganddroptransferk4lq0mSerializer.MediaSessionCompatQueueItem(i4);
                            if (requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer == onentered.IconCompatParcelizer) {
                                requestdraganddroptransferk4lq0mSerializer.read[i4 + 1] = obj2;
                                requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer = requestdraganddroptransferk4lq0mSerializer;
                            } else {
                                onentered.RemoteActionCompatParcelizer++;
                                Object[] objArr3 = requestdraganddroptransferk4lq0mSerializer.read;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                                objArrCopyOf2[i4 + 1] = obj2;
                                requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer = new requestDragAndDropTransferk4lQ0M(0, 0, objArrCopyOf2, onentered.IconCompatParcelizer);
                            }
                        }
                    }
                    onentered.write(onentered.RatingCompat + 1);
                    requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer = new requestDragAndDropTransferk4lQ0M(0, 0, ModuleDSLKt.serializer(0, obj, obj2, requestdraganddroptransferk4lq0mSerializer.read), onentered.IconCompatParcelizer);
                }
            } else {
                requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer = requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer(i, obj, obj2, i2 + 5, onentered);
            }
            if (requestdraganddroptransferk4lq0mSerializer != requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer) {
                return IconCompatParcelizer(i3, requestdraganddroptransferk4lq0mRemoteActionCompatParcelizer, onentered.IconCompatParcelizer);
            }
        }
        return this;
    }

    public final requestDragAndDropTransferk4lQ0M write(int i, int i2, Object obj) {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mWrite;
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        if (RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read[iIconCompatParcelizer]}, getCieXyz.write())).booleanValue()) {
                Object[] objArr = this.read;
                if (objArr.length != 2) {
                    return new requestDragAndDropTransferk4lQ0M(this.serializer ^ iRemoteActionCompatParcelizer, this.write, ModuleDSLKt.IconCompatParcelizer(iIconCompatParcelizer, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (write(iRemoteActionCompatParcelizer)) {
            int i3 = read(iRemoteActionCompatParcelizer);
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(i3);
            if (i2 == 30) {
                getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(requestdraganddroptransferk4lq0mSerializer.read.length)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
                int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
                int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
                int i6 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, requestdraganddroptransferk4lq0mSerializer.read[i4]}, getCieXyz.write())).booleanValue()) {
                            if (i4 == i5) {
                                requestdraganddroptransferk4lq0mWrite = requestdraganddroptransferk4lq0mSerializer;
                                break;
                            }
                            i4 += i6;
                        } else {
                            Object[] objArr2 = requestdraganddroptransferk4lq0mSerializer.read;
                            if (objArr2.length != 2) {
                                requestdraganddroptransferk4lq0mWrite = new requestDragAndDropTransferk4lQ0M(0, 0, ModuleDSLKt.IconCompatParcelizer(i4, objArr2), null);
                                break;
                            }
                            requestdraganddroptransferk4lq0mWrite = null;
                            break;
                        }
                    }
                } else {
                    requestdraganddroptransferk4lq0mWrite = requestdraganddroptransferk4lq0mSerializer;
                    break;
                }
            } else {
                requestdraganddroptransferk4lq0mWrite = requestdraganddroptransferk4lq0mSerializer.write(i, i2 + 5, obj);
            }
            if (requestdraganddroptransferk4lq0mWrite == null) {
                Object[] objArr3 = this.read;
                if (objArr3.length != 1) {
                    return new requestDragAndDropTransferk4lQ0M(this.serializer, iRemoteActionCompatParcelizer ^ this.write, ModuleDSLKt.read(i3, objArr3), null);
                }
                return null;
            }
            if (requestdraganddroptransferk4lq0mSerializer != requestdraganddroptransferk4lq0mWrite) {
                return IconCompatParcelizer(i3, iRemoteActionCompatParcelizer, requestdraganddroptransferk4lq0mWrite);
            }
        }
        return this;
    }

    public final requestDragAndDropTransferk4lQ0M IconCompatParcelizer(requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, int i, DragAndDropNodedrag1 dragAndDropNodedrag1, onEntered onentered) {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m2;
        int i2;
        Object[] objArr;
        int i3;
        int i4;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer;
        if (this == requestdraganddroptransferk4lq0m) {
            dragAndDropNodedrag1.write += read();
            return this;
        }
        int i5 = 0;
        if (i > 30) {
            DragAndDropNodeonEnded1 dragAndDropNodeonEnded1 = onentered.IconCompatParcelizer;
            int i6 = requestdraganddroptransferk4lq0m.write;
            Object[] objArr2 = this.read;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + requestdraganddroptransferk4lq0m.read.length);
            int length = this.read.length;
            getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(requestdraganddroptransferk4lq0m.read.length)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
            int i7 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
            int i8 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
            int i9 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (!write(requestdraganddroptransferk4lq0m.read[i7])) {
                        Object[] objArr3 = requestdraganddroptransferk4lq0m.read;
                        objArrCopyOf[length] = objArr3[i7];
                        objArrCopyOf[length + 1] = objArr3[i7 + 1];
                        length += 2;
                    } else {
                        dragAndDropNodedrag1.write++;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length != this.read.length) {
                if (length == requestdraganddroptransferk4lq0m.read.length) {
                    return requestdraganddroptransferk4lq0m;
                }
                if (length == objArrCopyOf.length) {
                    return new requestDragAndDropTransferk4lQ0M(0, 0, objArrCopyOf, dragAndDropNodeonEnded1);
                }
                return new requestDragAndDropTransferk4lQ0M(0, 0, Arrays.copyOf(objArrCopyOf, length), dragAndDropNodeonEnded1);
            }
        } else {
            int i10 = this.write | requestdraganddroptransferk4lq0m.write;
            int i11 = this.serializer;
            int i12 = requestdraganddroptransferk4lq0m.serializer;
            int i13 = i11 & i12;
            int i14 = (i11 ^ i12) & (~i10);
            while (i13 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i13);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read[IconCompatParcelizer(iLowestOneBit)], requestdraganddroptransferk4lq0m.read[requestdraganddroptransferk4lq0m.IconCompatParcelizer(iLowestOneBit)]}, getCieXyz.write())).booleanValue()) {
                    i14 |= iLowestOneBit;
                } else {
                    i10 |= iLowestOneBit;
                }
                i13 ^= iLowestOneBit;
            }
            if ((i10 & i14) != 0) {
                getContentCaptureSessionuiannotations.write("Check failed.");
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, onentered.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == i14 && this.write == i10) {
                requestdraganddroptransferk4lq0m2 = this;
            } else {
                requestdraganddroptransferk4lq0m2 = new requestDragAndDropTransferk4lQ0M(i14, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i14) * 2)], null);
            }
            int i15 = i10;
            int i16 = 0;
            while (i15 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i15);
                Object[] objArr4 = requestdraganddroptransferk4lq0m2.read;
                int length2 = objArr4.length;
                if (write(iLowestOneBit2)) {
                    requestdraganddroptransferk4lq0mSerializer = serializer(read(iLowestOneBit2));
                    if (requestdraganddroptransferk4lq0m.write(iLowestOneBit2)) {
                        requestdraganddroptransferk4lq0mSerializer = requestdraganddroptransferk4lq0mSerializer.IconCompatParcelizer(requestdraganddroptransferk4lq0m.serializer(requestdraganddroptransferk4lq0m.read(iLowestOneBit2)), i + 5, dragAndDropNodedrag1, onentered);
                    } else if (requestdraganddroptransferk4lq0m.RemoteActionCompatParcelizer(iLowestOneBit2)) {
                        int iIconCompatParcelizer = requestdraganddroptransferk4lq0m.IconCompatParcelizer(iLowestOneBit2);
                        Object obj = requestdraganddroptransferk4lq0m.read[iIconCompatParcelizer];
                        Object objMediaSessionCompatQueueItem = requestdraganddroptransferk4lq0m.MediaSessionCompatQueueItem(iIconCompatParcelizer);
                        int i17 = onentered.RatingCompat;
                        i2 = length2;
                        objArr = objArr4;
                        i3 = i14;
                        i4 = iLowestOneBit2;
                        requestdraganddroptransferk4lq0mSerializer = requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer(obj != null ? obj.hashCode() : i5, obj, objMediaSessionCompatQueueItem, i + 5, onentered);
                        if (onentered.RatingCompat == i17) {
                            dragAndDropNodedrag1.write++;
                        }
                    }
                    i2 = length2;
                    objArr = objArr4;
                    i3 = i14;
                    i4 = iLowestOneBit2;
                } else {
                    i2 = length2;
                    objArr = objArr4;
                    i3 = i14;
                    i4 = iLowestOneBit2;
                    if (requestdraganddroptransferk4lq0m.write(i4)) {
                        requestdraganddroptransferk4lq0mSerializer = requestdraganddroptransferk4lq0m.serializer(requestdraganddroptransferk4lq0m.read(i4));
                        if (RemoteActionCompatParcelizer(i4)) {
                            int iIconCompatParcelizer2 = IconCompatParcelizer(i4);
                            Object obj2 = this.read[iIconCompatParcelizer2];
                            int i18 = i + 5;
                            if (requestdraganddroptransferk4lq0mSerializer.IconCompatParcelizer(obj2 != null ? obj2.hashCode() : 0, i18, obj2)) {
                                dragAndDropNodedrag1.write++;
                            } else {
                                requestdraganddroptransferk4lq0mSerializer = requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer(obj2 != null ? obj2.hashCode() : 0, obj2, MediaSessionCompatQueueItem(iIconCompatParcelizer2), i18, onentered);
                            }
                        }
                    } else {
                        int iIconCompatParcelizer3 = IconCompatParcelizer(i4);
                        Object obj3 = this.read[iIconCompatParcelizer3];
                        Object objMediaSessionCompatQueueItem2 = MediaSessionCompatQueueItem(iIconCompatParcelizer3);
                        int iIconCompatParcelizer4 = requestdraganddroptransferk4lq0m.IconCompatParcelizer(i4);
                        Object obj4 = requestdraganddroptransferk4lq0m.read[iIconCompatParcelizer4];
                        requestdraganddroptransferk4lq0mSerializer = read(obj3 != null ? obj3.hashCode() : 0, obj3, objMediaSessionCompatQueueItem2, obj4 != null ? obj4.hashCode() : 0, obj4, requestdraganddroptransferk4lq0m.MediaSessionCompatQueueItem(iIconCompatParcelizer4), i + 5, onentered.IconCompatParcelizer);
                    }
                }
                objArr[(i2 - 1) - i16] = requestdraganddroptransferk4lq0mSerializer;
                i16++;
                i15 ^= i4;
                i14 = i3;
                i5 = 0;
            }
            int i19 = 0;
            while (i14 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i14);
                int i20 = i19 * 2;
                if (!requestdraganddroptransferk4lq0m.RemoteActionCompatParcelizer(iLowestOneBit3)) {
                    int iIconCompatParcelizer5 = IconCompatParcelizer(iLowestOneBit3);
                    Object[] objArr5 = requestdraganddroptransferk4lq0m2.read;
                    objArr5[i20] = this.read[iIconCompatParcelizer5];
                    objArr5[i20 + 1] = MediaSessionCompatQueueItem(iIconCompatParcelizer5);
                } else {
                    int iIconCompatParcelizer6 = requestdraganddroptransferk4lq0m.IconCompatParcelizer(iLowestOneBit3);
                    Object[] objArr6 = requestdraganddroptransferk4lq0m2.read;
                    objArr6[i20] = requestdraganddroptransferk4lq0m.read[iIconCompatParcelizer6];
                    objArr6[i20 + 1] = requestdraganddroptransferk4lq0m.MediaSessionCompatQueueItem(iIconCompatParcelizer6);
                    if (RemoteActionCompatParcelizer(iLowestOneBit3)) {
                        dragAndDropNodedrag1.write++;
                    }
                }
                i19++;
                i14 ^= iLowestOneBit3;
            }
            if (!write(requestdraganddroptransferk4lq0m2)) {
                return requestdraganddroptransferk4lq0m.write(requestdraganddroptransferk4lq0m2) ? requestdraganddroptransferk4lq0m : requestdraganddroptransferk4lq0m2;
            }
        }
        return this;
    }

    public static requestDragAndDropTransferk4lQ0M read(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, DragAndDropNodeonEnded1 dragAndDropNodeonEnded1) {
        Object[] objArr;
        if (i3 > 30) {
            return new requestDragAndDropTransferk4lQ0M(0, 0, new Object[]{obj, obj2, obj3, obj4}, dragAndDropNodeonEnded1);
        }
        int iRemoteActionCompatParcelizer = ModuleDSLKt.RemoteActionCompatParcelizer(i, i3);
        int iRemoteActionCompatParcelizer2 = ModuleDSLKt.RemoteActionCompatParcelizer(i2, i3);
        if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
            if (iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new requestDragAndDropTransferk4lQ0M((1 << iRemoteActionCompatParcelizer) | (1 << iRemoteActionCompatParcelizer2), 0, objArr, dragAndDropNodeonEnded1);
        }
        return new requestDragAndDropTransferk4lQ0M(0, 1 << iRemoteActionCompatParcelizer, new Object[]{read(i, obj, obj2, i2, obj3, obj4, i3 + 5, dragAndDropNodeonEnded1)}, dragAndDropNodeonEnded1);
    }

    public final requestDragAndDropTransferk4lQ0M IconCompatParcelizer(int i, Object obj, int i2, onEntered onentered) {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mIconCompatParcelizer;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m;
        int iRemoteActionCompatParcelizer = 1 << ModuleDSLKt.RemoteActionCompatParcelizer(i, i2);
        if (RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer)) {
            int iIconCompatParcelizer = IconCompatParcelizer(iRemoteActionCompatParcelizer);
            Object[] objArr = {obj, this.read[iIconCompatParcelizer]};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return serializer(iIconCompatParcelizer, iRemoteActionCompatParcelizer, onentered);
            }
        } else if (write(iRemoteActionCompatParcelizer)) {
            int i3 = read(iRemoteActionCompatParcelizer);
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mSerializer = serializer(i3);
            if (i2 == 30) {
                Object[] objArr2 = {0, Integer.valueOf(requestdraganddroptransferk4lq0mSerializer.read.length)};
                int iWrite = BackspaceCommand.write();
                getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -281231677, iWrite));
                int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
                int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
                int i6 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        Object[] objArr3 = {obj, requestdraganddroptransferk4lq0mSerializer.read[i4]};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                            requestdraganddroptransferk4lq0mIconCompatParcelizer = requestdraganddroptransferk4lq0mSerializer.RemoteActionCompatParcelizer(i4, onentered);
                        } else if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                }
                requestdraganddroptransferk4lq0m = requestdraganddroptransferk4lq0mSerializer;
                return read(requestdraganddroptransferk4lq0mSerializer, requestdraganddroptransferk4lq0m, i3, iRemoteActionCompatParcelizer, onentered.IconCompatParcelizer);
            }
            requestdraganddroptransferk4lq0mIconCompatParcelizer = requestdraganddroptransferk4lq0mSerializer.IconCompatParcelizer(i, obj, i2 + 5, onentered);
            requestdraganddroptransferk4lq0m = requestdraganddroptransferk4lq0mIconCompatParcelizer;
            return read(requestdraganddroptransferk4lq0mSerializer, requestdraganddroptransferk4lq0m, i3, iRemoteActionCompatParcelizer, onentered.IconCompatParcelizer);
        }
        return this;
    }
}
