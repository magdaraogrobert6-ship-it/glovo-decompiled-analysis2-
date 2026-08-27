package com.bumptech.glide.load.model;

import androidx.emoji2.text.EmojiProcessor;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import o.configureStrokePaintQ_0CZUIdefault;
import o.configureStrokePaintho4zsrM;
import o.drawImage9jGpkUE;
import o.drawLineNGM6Ib0;
import o.drawRoundRectZuiqVtQ;

/* JADX INFO: loaded from: classes.dex */
public final class MultiModelLoaderFactory {
    public final EmojiProcessor MediaDescriptionCompat;
    public static final configureStrokePaintho4zsrM serializer = new configureStrokePaintho4zsrM(10);
    public static final drawRoundRectZuiqVtQ IconCompatParcelizer = new drawRoundRectZuiqVtQ(2);
    public final ArrayList write = new ArrayList();
    public final HashSet RemoteActionCompatParcelizer = new HashSet();
    public final configureStrokePaintho4zsrM read = serializer;

    public final drawImage9jGpkUE serializer(Class cls, Class cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (drawLineNGM6Ib0 drawlinengm6ib0 : this.write) {
                    if (this.RemoteActionCompatParcelizer.contains(drawlinengm6ib0)) {
                        z = true;
                    } else if (drawlinengm6ib0.serializer.isAssignableFrom(cls) && drawlinengm6ib0.IconCompatParcelizer.isAssignableFrom(cls2)) {
                        this.RemoteActionCompatParcelizer.add(drawlinengm6ib0);
                        arrayList.add(drawlinengm6ib0.read.IconCompatParcelizer(this));
                        this.RemoteActionCompatParcelizer.remove(drawlinengm6ib0);
                    }
                }
                if (arrayList.size() > 1) {
                    configureStrokePaintho4zsrM configurestrokepaintho4zsrm = this.read;
                    EmojiProcessor emojiProcessor = this.MediaDescriptionCompat;
                    configurestrokepaintho4zsrm.getClass();
                    return new configureStrokePaintQ_0CZUIdefault(arrayList, 2, emojiProcessor);
                }
                if (arrayList.size() == 1) {
                    return (drawImage9jGpkUE) arrayList.get(0);
                }
                if (z) {
                    return IconCompatParcelizer;
                }
                throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer.clear();
                throw th;
            }
        }
    }

    public final ArrayList write(Class cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (drawLineNGM6Ib0 drawlinengm6ib0 : this.write) {
                if (!arrayList.contains(drawlinengm6ib0.IconCompatParcelizer) && drawlinengm6ib0.serializer.isAssignableFrom(cls)) {
                    arrayList.add(drawlinengm6ib0.IconCompatParcelizer);
                }
            }
        }
        return arrayList;
    }

    public MultiModelLoaderFactory(EmojiProcessor emojiProcessor) {
        this.MediaDescriptionCompat = emojiProcessor;
    }

    public final ArrayList serializer(Class cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (drawLineNGM6Ib0 drawlinengm6ib0 : this.write) {
                    if (!this.RemoteActionCompatParcelizer.contains(drawlinengm6ib0) && drawlinengm6ib0.serializer.isAssignableFrom(cls)) {
                        this.RemoteActionCompatParcelizer.add(drawlinengm6ib0);
                        arrayList.add(drawlinengm6ib0.read.IconCompatParcelizer(this));
                        this.RemoteActionCompatParcelizer.remove(drawlinengm6ib0);
                    }
                }
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer.clear();
                throw th;
            }
        }
        return arrayList;
    }
}
