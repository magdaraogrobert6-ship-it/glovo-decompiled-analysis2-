package com.bumptech.glide;

import androidx.emoji2.text.EmojiProcessor;
import bo.app.d$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.google.firebase.Timestamp;
import com.huawei.hmf.tasks.a.j;
import com.sentiance.okhttp3.u$a;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.FocusOwnerImplfocusSearch1;
import o.accessgetGreencp;
import o.accessgetMaxp;
import o.clipRectrOu3jXo;
import o.clipRectrOu3jXodefault;
import o.colorResource;
import o.drawGRGpd60;
import o.drawImage9jGpkUE;
import o.drawImageAZ2fEMs;
import o.drawImagegbVJVH8;
import o.drawLineNGM6Ib0;
import o.drawOvalAsUm42w;
import o.drawOvalAsUm42wdefault;
import o.drawOvalnJ9OG0default;
import o.drawymL40Pk;
import o.fromLinear;
import o.getInverseTransform;
import o.getOetfFuncui_graphics;
import o.getOetfOrigui_graphics;
import o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ;
import o.toLinear;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {
    public final u$a IconCompatParcelizer;
    public final drawImageAZ2fEMs MediaBrowserCompatMediaItem;
    public final u$a MediaMetadataCompat;
    public final u$a MediaSessionCompatQueueItem;
    public final EmojiProcessor RatingCompat;
    public final toLinear RemoteActionCompatParcelizer;
    public final u$a serializer;
    public final colorResource write;
    public final accessgetGreencp MediaDescriptionCompat = new accessgetGreencp(15);
    public final clipRectrOu3jXodefault read = new clipRectrOu3jXodefault();

    public class MissingComponentException extends RuntimeException {
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList;
        u$a u_a = this.serializer;
        synchronized (u_a) {
            arrayList = u_a.IconCompatParcelizer;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final void read(getOetfFuncui_graphics getoetffuncui_graphics) {
        toLinear tolinear = this.RemoteActionCompatParcelizer;
        synchronized (tolinear) {
            ((HashMap) tolinear.write).put(getoetffuncui_graphics.RemoteActionCompatParcelizer(), getoetffuncui_graphics);
        }
    }

    public final getOetfOrigui_graphics serializer(Object obj) {
        getOetfOrigui_graphics getoetforigui_graphicsWrite;
        toLinear tolinear = this.RemoteActionCompatParcelizer;
        synchronized (tolinear) {
            UrlUtils.read(obj);
            getOetfFuncui_graphics getoetffuncui_graphics = (getOetfFuncui_graphics) ((HashMap) tolinear.write).get(obj.getClass());
            if (getoetffuncui_graphics == null) {
                for (getOetfFuncui_graphics getoetffuncui_graphics2 : ((HashMap) tolinear.write).values()) {
                    if (getoetffuncui_graphics2.RemoteActionCompatParcelizer().isAssignableFrom(obj.getClass())) {
                        getoetffuncui_graphics = getoetffuncui_graphics2;
                        break;
                    }
                }
            }
            if (getoetffuncui_graphics == null) {
                getoetffuncui_graphics = toLinear.serializer;
            }
            getoetforigui_graphicsWrite = getoetffuncui_graphics.write(obj);
        }
        return getoetforigui_graphicsWrite;
    }

    public final List write(Object obj) {
        List listUnmodifiableList;
        drawImageAZ2fEMs drawimageaz2fems = this.MediaBrowserCompatMediaItem;
        drawimageaz2fems.getClass();
        Class<?> cls = obj.getClass();
        synchronized (drawimageaz2fems) {
            drawOvalAsUm42w drawovalasum42w = (drawOvalAsUm42w) drawimageaz2fems.IconCompatParcelizer.IconCompatParcelizer.get(cls);
            listUnmodifiableList = drawovalasum42w == null ? null : drawovalasum42w.read;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(drawimageaz2fems.read.serializer(cls));
                if (((drawOvalAsUm42w) drawimageaz2fems.IconCompatParcelizer.IconCompatParcelizer.put(cls, new drawOvalAsUm42w(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            drawImage9jGpkUE drawimage9jgpkue = (drawImage9jGpkUE) listUnmodifiableList.get(i);
            if (drawimage9jgpkue.write(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(drawimage9jgpkue);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final void write(Class cls, Class cls2, drawImagegbVJVH8 drawimagegbvjvh8) {
        drawImageAZ2fEMs drawimageaz2fems = this.MediaBrowserCompatMediaItem;
        synchronized (drawimageaz2fems) {
            MultiModelLoaderFactory multiModelLoaderFactory = drawimageaz2fems.read;
            synchronized (multiModelLoaderFactory) {
                drawLineNGM6Ib0 drawlinengm6ib0 = new drawLineNGM6Ib0(cls, cls2, drawimagegbvjvh8);
                ArrayList arrayList = multiModelLoaderFactory.write;
                arrayList.add(arrayList.size(), drawlinengm6ib0);
            }
            drawimageaz2fems.IconCompatParcelizer.IconCompatParcelizer.clear();
        }
    }

    public class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super(d$$ExternalSyntheticOutline0.m(cls, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    public Registry() {
        EmojiProcessor emojiProcessor = new EmojiProcessor(new FocusOwnerImplfocusSearch1(20), new j(17), new Timestamp.Companion(0));
        this.RatingCompat = emojiProcessor;
        this.MediaBrowserCompatMediaItem = new drawImageAZ2fEMs(emojiProcessor);
        this.IconCompatParcelizer = new u$a(5);
        this.write = new colorResource(15);
        this.MediaMetadataCompat = new u$a(7);
        this.RemoteActionCompatParcelizer = new toLinear();
        this.MediaSessionCompatQueueItem = new u$a(4);
        this.serializer = new u$a(6);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        colorResource colorresource = this.write;
        synchronized (colorresource) {
            ArrayList<String> arrayList2 = new ArrayList((ArrayList) colorresource.IconCompatParcelizer);
            ((ArrayList) colorresource.IconCompatParcelizer).clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ArrayList) colorresource.IconCompatParcelizer).add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    ((ArrayList) colorresource.IconCompatParcelizer).add(str);
                }
            }
        }
    }

    public final void write(Class cls, Class cls2, drawOvalnJ9OG0default drawovalnj9og0default) {
        u$a u_a = this.MediaSessionCompatQueueItem;
        synchronized (u_a) {
            u_a.IconCompatParcelizer.add(new drawOvalAsUm42wdefault(cls, cls2, drawovalnj9og0default));
        }
    }

    public final void RemoteActionCompatParcelizer(accessgetMaxp accessgetmaxp) {
        u$a u_a = this.serializer;
        synchronized (u_a) {
            u_a.IconCompatParcelizer.add(accessgetmaxp);
        }
    }

    public final void RemoteActionCompatParcelizer(Class cls, Class cls2, getInverseTransform getinversetransform) {
        write("legacy_append", cls, cls2, getinversetransform);
    }

    public final void write(String str, Class cls, Class cls2, getInverseTransform getinversetransform) {
        colorResource colorresource = this.write;
        synchronized (colorresource) {
            colorresource.write(str).add(new clipRectrOu3jXo(cls, cls2, getinversetransform));
        }
    }

    public final void read(Class cls, fromLinear fromlinear) {
        u$a u_a = this.MediaMetadataCompat;
        synchronized (u_a) {
            u_a.IconCompatParcelizer.add(new drawymL40Pk(cls, fromlinear));
        }
    }

    public final void serializer(Class cls, r8lambdayrUYrLf4y8jALbFcm2n28OpawQ r8lambdayruyrlf4y8jalbfcm2n28opawq) {
        u$a u_a = this.IconCompatParcelizer;
        synchronized (u_a) {
            u_a.IconCompatParcelizer.add(new drawGRGpd60(cls, r8lambdayruyrlf4y8jalbfcm2n28opawq));
        }
    }

    public final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException(String str) {
            super(str);
        }
    }

    public class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(String str) {
            super(str);
        }
    }

    public class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(String str) {
            super(str);
        }
    }
}
