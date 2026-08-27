package o;

import android.util.Log;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class accesscomputeXYZMatrix {
    public final String IconCompatParcelizer;
    public final drawOvalnJ9OG0default RemoteActionCompatParcelizer;
    public final List read;
    public final Class serializer;
    public final setRootFocusNodeui write;

    public final generateOetf RemoteActionCompatParcelizer(getOetfOrigui_graphics getoetforigui_graphics, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics, List list) throws com.bumptech.glide.load.engine.GlideException {
        List list2 = this.read;
        int size = list2.size();
        generateOetf generateoetfIconCompatParcelizer = null;
        for (int i3 = 0; i3 < size; i3++) {
            getInverseTransform getinversetransform = (getInverseTransform) list2.get(i3);
            try {
                if (getinversetransform.RemoteActionCompatParcelizer(getoetforigui_graphics.read(), geteotffuncui_graphics)) {
                    generateoetfIconCompatParcelizer = getinversetransform.IconCompatParcelizer(getoetforigui_graphics.read(), i, i2, geteotffuncui_graphics);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(getinversetransform);
                }
                list.add(e);
            }
            if (generateoetfIconCompatParcelizer != null) {
                break;
            }
        }
        if (generateoetfIconCompatParcelizer != null) {
            return generateoetfIconCompatParcelizer;
        }
        throw new com.bumptech.glide.load.engine.GlideException(this.IconCompatParcelizer, new ArrayList(list));
    }

    public accesscomputeXYZMatrix(Class cls, Class cls2, Class cls3, List list, drawOvalnJ9OG0default drawovalnj9og0default, setRootFocusNodeui setrootfocusnodeui) {
        this.serializer = cls;
        this.read = list;
        this.RemoteActionCompatParcelizer = drawovalnj9og0default;
        this.write = setrootfocusnodeui;
        this.IconCompatParcelizer = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final generateOetf serializer(int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics, getOetfOrigui_graphics getoetforigui_graphics, computePrimariesui_graphics computeprimariesui_graphics) {
        generateOetf generateoetfWrite;
        getEotf geteotf;
        r8lambdafQNxHYBbQei_ep6070iYk6_yIE r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer;
        fromLinear fromlinearIconCompatParcelizer;
        boolean z;
        boolean z2;
        boolean z3;
        Object r8lambdaorypq8_4ibzyferyrc7kwkieahc;
        setRootFocusNodeui setrootfocusnodeui = this.write;
        List list = (List) setrootfocusnodeui.write();
        UrlUtils.serializer(list, "Argument must not be null");
        try {
            generateOetf generateoetfRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getoetforigui_graphics, i, i2, geteotffuncui_graphics, list);
            setrootfocusnodeui.IconCompatParcelizer(list);
            com.bumptech.glide.load.engine.DecodeJob decodeJob = (com.bumptech.glide.load.engine.DecodeJob) computeprimariesui_graphics.IconCompatParcelizer;
            r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i = (r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I) computeprimariesui_graphics.read;
            com.bumptech.glide.load.engine.DecodeHelper decodeHelper = decodeJob.RatingCompat;
            Class<?> cls = generateoetfRemoteActionCompatParcelizer.IconCompatParcelizer().getClass();
            if (r8lambdayjgjsam_wcskwad6z3tn2h9p74i != r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.RESOURCE_DISK_CACHE) {
                getEotf geteotfWrite = decodeHelper.write(cls);
                generateoetfWrite = geteotfWrite.write(decodeJob.ParcelableVolumeInfo, generateoetfRemoteActionCompatParcelizer, decodeJob._init_lambda4, decodeJob.ResultReceiver);
                geteotf = geteotfWrite;
            } else {
                generateoetfWrite = generateoetfRemoteActionCompatParcelizer;
                geteotf = null;
            }
            if (!generateoetfRemoteActionCompatParcelizer.equals(generateoetfWrite)) {
                generateoetfRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
            }
            if (decodeHelper.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().MediaMetadataCompat.IconCompatParcelizer(generateoetfWrite.RemoteActionCompatParcelizer()) != null) {
                fromlinearIconCompatParcelizer = decodeHelper.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().MediaMetadataCompat.IconCompatParcelizer(generateoetfWrite.RemoteActionCompatParcelizer());
                if (fromlinearIconCompatParcelizer != null) {
                    r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer = fromlinearIconCompatParcelizer.IconCompatParcelizer(decodeJob.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                } else {
                    throw new com.bumptech.glide.Registry.NoResultEncoderAvailableException(generateoetfWrite.RemoteActionCompatParcelizer());
                }
            } else {
                r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer = r8lambdafQNxHYBbQei_ep6070iYk6_yIE.NONE;
                fromlinearIconCompatParcelizer = null;
            }
            eotfFunclambda0 eotffunclambda0 = decodeJob.MediaDescriptionCompat;
            ArrayList arrayListRemoteActionCompatParcelizer = decodeHelper.RemoteActionCompatParcelizer();
            int size = arrayListRemoteActionCompatParcelizer.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((drawLine1RTmtNc) arrayListRemoteActionCompatParcelizer.get(i3)).RemoteActionCompatParcelizer.equals(eotffunclambda0)) {
                    z = true;
                    break;
                }
                i3++;
            }
            int i4 = decodeJob.PlaybackStateCompat.RemoteActionCompatParcelizer;
            if (i4 != 0 && i4 != 1 && (((!z && r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.DATA_DISK_CACHE) || r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL) && r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer == r8lambdafQNxHYBbQei_ep6070iYk6_yIE.TRANSFORMED)) {
                if (fromlinearIconCompatParcelizer != null) {
                    int i5 = accessgenerateOetf.RemoteActionCompatParcelizer[r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer.ordinal()];
                    if (i5 == 1) {
                        z2 = true;
                        z3 = false;
                        r8lambdaorypq8_4ibzyferyrc7kwkieahc = new r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc(decodeJob.MediaDescriptionCompat, decodeJob.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                    } else if (i5 == 2) {
                        z3 = false;
                        r8lambdaorypq8_4ibzyferyrc7kwkieahc = new generateOetflambda2(decodeHelper.RemoteActionCompatParcelizer.write, decodeJob.MediaDescriptionCompat, decodeJob.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, decodeJob._init_lambda4, decodeJob.ResultReceiver, geteotf, cls, decodeJob.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                        z2 = true;
                    } else {
                        Gson$$ExternalSyntheticBUOutline0.m(r8lambdafqnxhybbqei_ep6070iyk6_yieIconCompatParcelizer, "Unknown strategy: ");
                        return null;
                    }
                    generateOetflambda1 generateoetflambda1 = (generateOetflambda1) generateOetflambda1.serializer.write();
                    generateoetflambda1.IconCompatParcelizer = z3;
                    generateoetflambda1.RemoteActionCompatParcelizer = z2;
                    generateoetflambda1.read = generateoetfWrite;
                    androidx.navigation.NavArgsLazy navArgsLazy = decodeJob.MediaSessionCompatToken;
                    navArgsLazy.MediaSessionCompatQueueItem = r8lambdaorypq8_4ibzyferyrc7kwkieahc;
                    navArgsLazy.read = fromlinearIconCompatParcelizer;
                    navArgsLazy.RatingCompat = generateoetflambda1;
                    generateoetfWrite = generateoetflambda1;
                } else {
                    throw new com.bumptech.glide.Registry.NoResultEncoderAvailableException(generateoetfWrite.IconCompatParcelizer().getClass());
                }
            }
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(generateoetfWrite, geteotffuncui_graphics);
        } catch (Throwable th) {
            setrootfocusnodeui.IconCompatParcelizer(list);
            throw th;
        }
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.serializer + ", decoders=" + this.read + ", transcoder=" + this.RemoteActionCompatParcelizer + '}';
    }
}
