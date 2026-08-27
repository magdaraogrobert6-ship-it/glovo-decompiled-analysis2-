package o;

import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ModifierNodeElement {
    public final androidx.work.impl.WorkerWrapper.Builder MediaBrowserCompatMediaItem;
    public final getDetachedFromParentLookaheadPlacement MediaDescriptionCompat;
    public final access500 MediaMetadataCompat;
    public final AtomicInteger RatingCompat = new AtomicInteger(0);
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public static final int IconCompatParcelizer = 15;
    public static final didInsert read = new didInsert();
    public static final LayoutNode$$ExternalSyntheticLambda1 write = new LayoutNode$$ExternalSyntheticLambda1(6);
    public static final io.sentry.cache.read serializer = new io.sentry.cache.read(3);

    public static String serializer(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(file, new FileInputStream(file));
        while (true) {
            try {
                int i = fileInputStreamWrite.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), RemoteActionCompatParcelizer);
                    fileInputStreamWrite.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStreamWrite.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final ArrayList read() {
        ArrayList arrayList = new ArrayList();
        androidx.work.impl.WorkerWrapper.Builder builder = this.MediaBrowserCompatMediaItem;
        arrayList.addAll(androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.IconCompatParcelizer).listFiles()));
        arrayList.addAll(androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.RemoteActionCompatParcelizer).listFiles()));
        LayoutNode$$ExternalSyntheticLambda1 layoutNode$$ExternalSyntheticLambda1 = write;
        Collections.sort(arrayList, layoutNode$$ExternalSyntheticLambda1);
        List listSerializer = androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.MediaMetadataCompat).listFiles());
        Collections.sort(listSerializer, layoutNode$$ExternalSyntheticLambda1);
        arrayList.addAll(listSerializer);
        return arrayList;
    }

    public final NavigableSet serializer() {
        return new TreeSet(androidx.work.impl.WorkerWrapper.Builder.serializer(((File) this.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem).list())).descendingSet();
    }

    public final void serializer(getLastPositionnOccacui getlastpositionnoccacui, String str, boolean z) {
        androidx.work.impl.WorkerWrapper.Builder builder = this.MediaBrowserCompatMediaItem;
        int i = this.MediaMetadataCompat.write().MediaMetadataCompat.IconCompatParcelizer;
        read.getClass();
        try {
            read(builder.RemoteActionCompatParcelizer(str, ff$$ExternalSyntheticOutline0.m("event", String.format(java.util.Locale.US, "%010d", Integer.valueOf(this.RatingCompat.getAndIncrement())), z ? BundleUtil.UNDERLINE_TAG : "")), didInsert.IconCompatParcelizer.IconCompatParcelizer(getlastpositionnoccacui));
        } catch (IOException e) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        io.sentry.cache.read readVar = new io.sentry.cache.read(4);
        builder.getClass();
        File file = new File((File) builder.MediaBrowserCompatMediaItem, str);
        file.mkdirs();
        List<File> listSerializer = androidx.work.impl.WorkerWrapper.Builder.serializer(file.listFiles(readVar));
        Collections.sort(listSerializer, new LayoutNode$$ExternalSyntheticLambda1(7));
        int size = listSerializer.size();
        for (File file2 : listSerializer) {
            if (size <= i) {
                return;
            }
            androidx.work.impl.WorkerWrapper.Builder.write(file2);
            size--;
        }
    }

    public static void RemoteActionCompatParcelizer(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static void read(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(file), file), RemoteActionCompatParcelizer);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ModifierNodeElement(androidx.work.impl.WorkerWrapper.Builder builder, access500 access500Var, getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement) {
        this.MediaBrowserCompatMediaItem = builder;
        this.MediaMetadataCompat = access500Var;
        this.MediaDescriptionCompat = getdetachedfromparentlookaheadplacement;
    }
}
