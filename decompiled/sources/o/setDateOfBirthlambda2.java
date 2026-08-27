package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.Status;
import io.sentry.MovePreviousSession;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class setDateOfBirthlambda2 implements Closeable {
    public final setCustomUserAttributeJSONlambda0 IconCompatParcelizer;
    public final GifDrawableTransformation RemoteActionCompatParcelizer;
    public final setCustomAttributelambda1 read;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }

    public final ArrayList read(int i, short s, byte b, int i2) throws IOException {
        setCustomUserAttributeJSONlambda0 setcustomuserattributejsonlambda0 = this.IconCompatParcelizer;
        setcustomuserattributejsonlambda0.read = i;
        setcustomuserattributejsonlambda0.RemoteActionCompatParcelizer = i;
        setcustomuserattributejsonlambda0.IconCompatParcelizer = s;
        setcustomuserattributejsonlambda0.write = b;
        setcustomuserattributejsonlambda0.MediaBrowserCompatMediaItem = i2;
        setCustomAttributelambda1 setcustomattributelambda1 = this.read;
        GifDrawableTransformation gifDrawableTransformation = setcustomattributelambda1.MediaMetadataCompat;
        ArrayList arrayList = setcustomattributelambda1.write;
        while (!gifDrawableTransformation.RatingCompat()) {
            byte bMediaBrowserCompatMediaItem = gifDrawableTransformation.MediaBrowserCompatMediaItem();
            int i3 = bMediaBrowserCompatMediaItem & 255;
            if (i3 == 128) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("index == 0");
                return null;
            }
            if ((bMediaBrowserCompatMediaItem & 128) == 128) {
                int iSerializer = setcustomattributelambda1.serializer(i3, 127);
                int i4 = iSerializer - 1;
                if (i4 >= 0) {
                    incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = setCustomLocationAttributelambda1.IconCompatParcelizer;
                    if (i4 <= incrementcustomuserattributelambda1Arr.length - 1) {
                        arrayList.add(incrementcustomuserattributelambda1Arr[i4]);
                    }
                }
                int length = setcustomattributelambda1.MediaDescriptionCompat + 1 + (i4 - setCustomLocationAttributelambda1.IconCompatParcelizer.length);
                if (length >= 0) {
                    incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr2 = setcustomattributelambda1.IconCompatParcelizer;
                    if (length <= incrementcustomuserattributelambda1Arr2.length - 1) {
                        arrayList.add(incrementcustomuserattributelambda1Arr2[length]);
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iSerializer, "Header index too large "));
                return null;
            }
            if (i3 == 64) {
                RequestBuilder requestBuilderRemoteActionCompatParcelizer = setcustomattributelambda1.RemoteActionCompatParcelizer();
                setCustomLocationAttributelambda1.read(requestBuilderRemoteActionCompatParcelizer);
                setcustomattributelambda1.serializer(new incrementCustomUserAttributelambda1(requestBuilderRemoteActionCompatParcelizer, setcustomattributelambda1.RemoteActionCompatParcelizer()));
            } else if ((bMediaBrowserCompatMediaItem & 64) == 64) {
                setcustomattributelambda1.serializer(new incrementCustomUserAttributelambda1(setcustomattributelambda1.IconCompatParcelizer(setcustomattributelambda1.serializer(i3, 63) - 1), setcustomattributelambda1.RemoteActionCompatParcelizer()));
            } else if ((bMediaBrowserCompatMediaItem & 32) == 32) {
                int iSerializer2 = setcustomattributelambda1.serializer(i3, 31);
                setcustomattributelambda1.MediaSessionCompatQueueItem = iSerializer2;
                if (iSerializer2 < 0 || iSerializer2 > setcustomattributelambda1.serializer) {
                    DrawableTransformation.RemoteActionCompatParcelizer(setcustomattributelambda1.MediaSessionCompatQueueItem, "Invalid dynamic table size update ");
                    return null;
                }
                int i5 = setcustomattributelambda1.RemoteActionCompatParcelizer;
                if (iSerializer2 < i5) {
                    if (iSerializer2 == 0) {
                        Arrays.fill(setcustomattributelambda1.IconCompatParcelizer, (Object) null);
                        setcustomattributelambda1.MediaDescriptionCompat = setcustomattributelambda1.IconCompatParcelizer.length - 1;
                        setcustomattributelambda1.read = 0;
                        setcustomattributelambda1.RemoteActionCompatParcelizer = 0;
                    } else {
                        setcustomattributelambda1.RemoteActionCompatParcelizer(i5 - iSerializer2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                RequestBuilder requestBuilderRemoteActionCompatParcelizer2 = setcustomattributelambda1.RemoteActionCompatParcelizer();
                setCustomLocationAttributelambda1.read(requestBuilderRemoteActionCompatParcelizer2);
                arrayList.add(new incrementCustomUserAttributelambda1(requestBuilderRemoteActionCompatParcelizer2, setcustomattributelambda1.RemoteActionCompatParcelizer()));
            } else {
                arrayList.add(new incrementCustomUserAttributelambda1(setcustomattributelambda1.IconCompatParcelizer(setcustomattributelambda1.serializer(i3, 15) - 1), setcustomattributelambda1.RemoteActionCompatParcelizer()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public setDateOfBirthlambda2(GifDrawableTransformation gifDrawableTransformation) {
        this.RemoteActionCompatParcelizer = gifDrawableTransformation;
        setCustomUserAttributeJSONlambda0 setcustomuserattributejsonlambda0 = new setCustomUserAttributeJSONlambda0(gifDrawableTransformation);
        this.IconCompatParcelizer = setcustomuserattributejsonlambda0;
        this.read = new setCustomAttributelambda1(setcustomuserattributejsonlambda0);
    }

    public final boolean RemoteActionCompatParcelizer(cancelTimer canceltimer) throws IOException {
        boolean z;
        r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk r8lambdav2sqaxywfhzrw2q44hujvnmyqk;
        short sMediaBrowserCompatMediaItem = 0;
        try {
            this.RemoteActionCompatParcelizer.MediaMetadataCompat(9L);
            int i = setCustomLocationAttributelambda2.read(this.RemoteActionCompatParcelizer);
            r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i = null;
            if (i >= 0 && i <= 16384) {
                byte bMediaBrowserCompatMediaItem = (byte) (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() & 255);
                byte bMediaBrowserCompatMediaItem2 = (byte) (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() & 255);
                int iMediaSessionCompatResultReceiverWrapper = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper() & Integer.MAX_VALUE;
                java.util.logging.Logger logger = setCustomLocationAttributelambda2.write;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(setDateOfBirthlambda1.read(true, iMediaSessionCompatResultReceiverWrapper, i, bMediaBrowserCompatMediaItem, bMediaBrowserCompatMediaItem2));
                }
                switch (bMediaBrowserCompatMediaItem) {
                    case 0:
                        read(canceltimer, i, bMediaBrowserCompatMediaItem2, iMediaSessionCompatResultReceiverWrapper);
                        return true;
                    case 1:
                        serializer(canceltimer, i, bMediaBrowserCompatMediaItem2, iMediaSessionCompatResultReceiverWrapper);
                        return true;
                    case 2:
                        if (i != 5) {
                            setCustomLocationAttributelambda2.serializer("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
                            throw null;
                        }
                        if (iMediaSessionCompatResultReceiverWrapper != 0) {
                            GifDrawableTransformation gifDrawableTransformation = this.RemoteActionCompatParcelizer;
                            gifDrawableTransformation.MediaSessionCompatResultReceiverWrapper();
                            gifDrawableTransformation.MediaBrowserCompatMediaItem();
                            return true;
                        }
                        setCustomLocationAttributelambda2.serializer("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    case 3:
                        IconCompatParcelizer(canceltimer, i, iMediaSessionCompatResultReceiverWrapper);
                        return true;
                    case 4:
                        IconCompatParcelizer(canceltimer, i, bMediaBrowserCompatMediaItem2, iMediaSessionCompatResultReceiverWrapper);
                        return true;
                    case 5:
                        if (iMediaSessionCompatResultReceiverWrapper != 0) {
                            sMediaBrowserCompatMediaItem = (bMediaBrowserCompatMediaItem2 & 8) != 0 ? (short) (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() & 255) : (short) 0;
                            int iMediaSessionCompatResultReceiverWrapper2 = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                            ArrayList arrayList = read(setCustomLocationAttributelambda2.read(i - 4, bMediaBrowserCompatMediaItem2, sMediaBrowserCompatMediaItem), sMediaBrowserCompatMediaItem, bMediaBrowserCompatMediaItem2, iMediaSessionCompatResultReceiverWrapper);
                            OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) canceltimer.read;
                            r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND;
                            if (okHttpCall$1.MediaBrowserCompatMediaItem()) {
                                ((java.util.logging.Logger) okHttpCall$1.write).log((Level) okHttpCall$1.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " PUSH_PROMISE: streamId=" + iMediaSessionCompatResultReceiverWrapper + " promisedStreamId=" + (iMediaSessionCompatResultReceiverWrapper2 & Integer.MAX_VALUE) + " headers=" + arrayList);
                            }
                            synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.write(iMediaSessionCompatResultReceiverWrapper, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR);
                                break;
                            }
                            return true;
                        }
                        setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    case 6:
                        z = true;
                        if (i != 8) {
                            setCustomLocationAttributelambda2.serializer("TYPE_PING length != 8: %s", Integer.valueOf(i));
                            throw null;
                        }
                        if (iMediaSessionCompatResultReceiverWrapper == 0) {
                            int iMediaSessionCompatResultReceiverWrapper3 = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                            int iMediaSessionCompatResultReceiverWrapper4 = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                            sMediaBrowserCompatMediaItem = (bMediaBrowserCompatMediaItem2 & 1) != 0 ? (short) 1 : (short) 0;
                            long j = (((long) iMediaSessionCompatResultReceiverWrapper3) << 32) | (((long) iMediaSessionCompatResultReceiverWrapper4) & 4294967295L);
                            ((OkHttpCall$1) canceltimer.read).RemoteActionCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, j);
                            Object obj = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            if (sMediaBrowserCompatMediaItem == 0) {
                                synchronized (obj) {
                                    ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.read(iMediaSessionCompatResultReceiverWrapper3, iMediaSessionCompatResultReceiverWrapper4, true);
                                    break;
                                }
                                return true;
                            }
                            synchronized (obj) {
                                r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2 = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                if (r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2 == null) {
                                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read.warning("Received unexpected ping ack. No ping outstanding");
                                } else if (r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2.serializer() == j) {
                                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                                    r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i3 = r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                    r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = null;
                                    r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i = r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i3;
                                } else {
                                    java.util.logging.Logger logger2 = r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read;
                                    Level level = Level.WARNING;
                                    java.util.Locale locale = java.util.Locale.US;
                                    logger2.log(level, "Received unexpected ping ack. Expecting " + ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.serializer() + ", got " + j);
                                }
                                break;
                            }
                            if (r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i != null) {
                                r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i.IconCompatParcelizer();
                            }
                            return z;
                        }
                        setCustomLocationAttributelambda2.serializer("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    case 7:
                        GifDrawableTransformation gifDrawableTransformation2 = this.RemoteActionCompatParcelizer;
                        if (i < 8) {
                            setCustomLocationAttributelambda2.serializer("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
                            throw null;
                        }
                        if (iMediaSessionCompatResultReceiverWrapper == 0) {
                            int iMediaSessionCompatResultReceiverWrapper5 = gifDrawableTransformation2.MediaSessionCompatResultReceiverWrapper();
                            int iMediaSessionCompatResultReceiverWrapper6 = gifDrawableTransformation2.MediaSessionCompatResultReceiverWrapper();
                            int i2 = i - 8;
                            r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 = r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.fromHttp2(iMediaSessionCompatResultReceiverWrapper6);
                            if (r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 != null) {
                                RequestBuilder requestBuilderRemoteActionCompatParcelizer = RequestBuilder.EMPTY;
                                if (i2 > 0) {
                                    requestBuilderRemoteActionCompatParcelizer = gifDrawableTransformation2.RemoteActionCompatParcelizer(i2);
                                }
                                r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu2 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                                ((OkHttpCall$1) canceltimer.read).serializer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, iMediaSessionCompatResultReceiverWrapper5, r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2, requestBuilderRemoteActionCompatParcelizer);
                                if (r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 == r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.ENHANCE_YOUR_CALM) {
                                    String strRatingCompat = requestBuilderRemoteActionCompatParcelizer.RatingCompat();
                                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read.log(Level.WARNING, canceltimer + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strRatingCompat);
                                    if ("too_many_pings".equals(strRatingCompat)) {
                                        r8lambda1dlenebwpksdsvf_xikspxtdeu2.defaultViewModelProviderFactory_delegatelambda0.run();
                                    }
                                }
                                Status status = r8lambdaT4klpHJxsSFGt768ChPJUqQgNh4.statusForCode(r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2.httpCode).read("Received Goaway");
                                if (requestBuilderRemoteActionCompatParcelizer.serializer() > 0) {
                                    status = status.read(requestBuilderRemoteActionCompatParcelizer.RatingCompat());
                                }
                                Map map = r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.serializer;
                                r8lambda1dlenebwpksdsvf_xikspxtdeu2.IconCompatParcelizer(iMediaSessionCompatResultReceiverWrapper5, null, status);
                                return true;
                            }
                            setCustomLocationAttributelambda2.serializer("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iMediaSessionCompatResultReceiverWrapper6));
                            throw null;
                        }
                        setCustomLocationAttributelambda2.serializer("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    case 8:
                        if (i == 4) {
                            long jMediaSessionCompatResultReceiverWrapper = ((long) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()) & 2147483647L;
                            if (jMediaSessionCompatResultReceiverWrapper != 0) {
                                ((OkHttpCall$1) canceltimer.read).IconCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, iMediaSessionCompatResultReceiverWrapper, jMediaSessionCompatResultReceiverWrapper);
                                r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu3 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                                if (jMediaSessionCompatResultReceiverWrapper == 0) {
                                    if (iMediaSessionCompatResultReceiverWrapper == 0) {
                                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.write(r8lambda1dlenebwpksdsvf_xikspxtdeu3, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                                        return true;
                                    }
                                    r8lambda1dlenebwpksdsvf_xikspxtdeu3.IconCompatParcelizer(iMediaSessionCompatResultReceiverWrapper, Status.write.IconCompatParcelizer("Received 0 flow control window increment."), r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED, false, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR, null);
                                    return true;
                                }
                                z = true;
                                synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu4 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                                    try {
                                        if (iMediaSessionCompatResultReceiverWrapper == 0) {
                                            r8lambda1dlenebwpksdsvf_xikspxtdeu4.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.read(null, (int) jMediaSessionCompatResultReceiverWrapper);
                                            return true;
                                        }
                                        r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) r8lambda1dlenebwpksdsvf_xikspxtdeu4.createFullyDrawnExecutor.get(Integer.valueOf(iMediaSessionCompatResultReceiverWrapper));
                                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu5 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                                        if (r8lambda1govqe20wmpp9dwezhg5pphjsce != null) {
                                            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = r8lambda1dlenebwpksdsvf_xikspxtdeu5.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                                            r8lambdakEPpEUfTPwAZBc7DrHg_Qad0Y4 r8lambdakeppeuftpwazbc7drhg_qad0y4 = r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo;
                                            synchronized (r8lambdakeppeuftpwazbc7drhg_qad0y4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                                                r8lambdav2sqaxywfhzrw2q44hujvnmyqk = r8lambdakeppeuftpwazbc7drhg_qad0y4.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                                break;
                                            }
                                            r8lambdau31fnmctqqics3i75jr9dkzcek.read(r8lambdav2sqaxywfhzrw2q44hujvnmyqk, (int) jMediaSessionCompatResultReceiverWrapper);
                                        } else if (!r8lambda1dlenebwpksdsvf_xikspxtdeu5.IconCompatParcelizer(iMediaSessionCompatResultReceiverWrapper)) {
                                            sMediaBrowserCompatMediaItem = 1;
                                        }
                                        if (sMediaBrowserCompatMediaItem != 0) {
                                            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.write((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR, "Received window_update for unknown stream: " + iMediaSessionCompatResultReceiverWrapper);
                                            return true;
                                        }
                                        return z;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            setCustomLocationAttributelambda2.serializer("windowSizeIncrement was 0", new Object[0]);
                            throw null;
                        }
                        setCustomLocationAttributelambda2.serializer("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
                        throw null;
                    default:
                        this.RemoteActionCompatParcelizer.RatingCompat(i);
                        return true;
                }
            }
            setCustomLocationAttributelambda2.serializer("FRAME_SIZE_ERROR: %s", Integer.valueOf(i));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void IconCompatParcelizer(cancelTimer canceltimer, int i, int i2) throws IOException {
        r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg;
        if (i != 4) {
            setCustomLocationAttributelambda2.serializer("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            int iMediaSessionCompatResultReceiverWrapper = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 = r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.fromHttp2(iMediaSessionCompatResultReceiverWrapper);
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 != null) {
                ((OkHttpCall$1) canceltimer.read).read(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, i2, r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2);
                Status status = r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.read(r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2).read("Rst Stream");
                invokeMethodQuietly invokemethodquietly = status.PlaybackStateCompat;
                boolean z = invokemethodquietly == invokeMethodQuietly.CANCELLED || invokemethodquietly == invokeMethodQuietly.DEADLINE_EXCEEDED;
                synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                    r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).createFullyDrawnExecutor.get(Integer.valueOf(i2));
                    if (r8lambda1govqe20wmpp9dwezhg5pphjsce != null) {
                        getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo._init_lambda1;
                        executelambda2.serializer.getClass();
                        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                        if (r8lambdatmte9dbjpre9qf6mggphoyhct6sFromHttp2 == r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.REFUSED_STREAM) {
                            r8lambdacixdbs1vmz7djpim5hikhhgartg = r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.REFUSED;
                        } else {
                            r8lambdacixdbs1vmz7djpim5hikhhgartg = r8lambdacIxdbs1VMz7DJpiM5hikhHgartg.PROCESSED;
                        }
                        r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer(i2, status, r8lambdacixdbs1vmz7djpim5hikhhgartg, z, null, null);
                    }
                }
                return;
            }
            setCustomLocationAttributelambda2.serializer("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iMediaSessionCompatResultReceiverWrapper));
            throw null;
        }
        setCustomLocationAttributelambda2.serializer("TYPE_RST_STREAM streamId == 0", new Object[0]);
        throw null;
    }

    public final void IconCompatParcelizer(cancelTimer canceltimer, int i, byte b, int i2) throws IOException {
        boolean z;
        if (i2 != 0) {
            setCustomLocationAttributelambda2.serializer("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                return;
            }
            setCustomLocationAttributelambda2.serializer("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 == 0) {
            getDateMillisOrDefault getdatemillisordefault = new getDateMillisOrDefault(1);
            int i3 = 0;
            while (true) {
                short s = 7;
                if (i3 < i) {
                    short sComponentActivity = this.RemoteActionCompatParcelizer.ComponentActivity();
                    int iMediaSessionCompatResultReceiverWrapper = this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    switch (sComponentActivity) {
                        case 1:
                        case 6:
                            s = sComponentActivity;
                            break;
                        case 2:
                            if (iMediaSessionCompatResultReceiverWrapper != 0 && iMediaSessionCompatResultReceiverWrapper != 1) {
                                setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                            s = sComponentActivity;
                            break;
                            break;
                        case 3:
                            s = 4;
                            break;
                        case 4:
                            if (iMediaSessionCompatResultReceiverWrapper < 0) {
                                setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            break;
                        case 5:
                            if (iMediaSessionCompatResultReceiverWrapper < 16384 || iMediaSessionCompatResultReceiverWrapper > 16777215) {
                                setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iMediaSessionCompatResultReceiverWrapper));
                                throw null;
                            }
                            s = sComponentActivity;
                            break;
                            break;
                        default:
                            continue;
                            i3 += 6;
                            break;
                    }
                    getdatemillisordefault.write(s, iMediaSessionCompatResultReceiverWrapper);
                    i3 += 6;
                } else {
                    ((OkHttpCall$1) canceltimer.read).read(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, getdatemillisordefault);
                    synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                        if (getdatemillisordefault.write(4)) {
                            ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getdatemillisordefault.read[4];
                        }
                        if (getdatemillisordefault.write(7)) {
                            int i4 = getdatemillisordefault.read[7];
                            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                            if (i4 >= 0) {
                                int i5 = i4 - r8lambdau31fnmctqqics3i75jr9dkzcek.MediaBrowserCompatMediaItem;
                                r8lambdau31fnmctqqics3i75jr9dkzcek.MediaBrowserCompatMediaItem = i4;
                                for (r8lambdaV2sqaxywFhZrw2q44hUjvnmyQk r8lambdav2sqaxywfhzrw2q44hujvnmyqk : ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat).write()) {
                                    r8lambdav2sqaxywfhzrw2q44hujvnmyqk.read(i5);
                                }
                                z = i5 > 0;
                            } else {
                                r8lambdau31fnmctqqics3i75jr9dkzcek.getClass();
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i4, "Invalid initial window size: "));
                            }
                        }
                        if (canceltimer.IconCompatParcelizer) {
                            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                            accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer;
                            Iterator it = ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac.write).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.iterator();
                            if (!it.hasNext()) {
                                r8lambda1dlenebwpksdsvf_xikspxtdeu.IconCompatParcelizer = getprettyprintedstringlambda0;
                                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac2 = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac2.write;
                                r8lambday78ccsnuxer22a2wvqifr2bmbdo.RatingCompat.serializer(optEnum.INFO, "READY");
                                r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new MovePreviousSession(14, accessgetapparenttorealoffsetnoccac2));
                                canceltimer.IconCompatParcelizer = false;
                            } else {
                                it.next().getClass();
                                throw new ClassCastException();
                            }
                        }
                        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.read(getdatemillisordefault);
                        if (z) {
                            ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer();
                        }
                        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).MediaMetadataCompat();
                    }
                    int i6 = getdatemillisordefault.RemoteActionCompatParcelizer & 2;
                    if (i6 == 0 || getdatemillisordefault.read[1] < 0) {
                        return;
                    }
                    setCustomAttributelambda1 setcustomattributelambda1 = this.read;
                    int i7 = i6 != 0 ? getdatemillisordefault.read[1] : -1;
                    setcustomattributelambda1.serializer = i7;
                    setcustomattributelambda1.MediaSessionCompatQueueItem = i7;
                    int i8 = setcustomattributelambda1.RemoteActionCompatParcelizer;
                    if (i7 < i8) {
                        if (i7 == 0) {
                            Arrays.fill(setcustomattributelambda1.IconCompatParcelizer, (Object) null);
                            setcustomattributelambda1.MediaDescriptionCompat = setcustomattributelambda1.IconCompatParcelizer.length - 1;
                            setcustomattributelambda1.read = 0;
                            setcustomattributelambda1.RemoteActionCompatParcelizer = 0;
                            return;
                        }
                        setcustomattributelambda1.RemoteActionCompatParcelizer(i8 - i7);
                        return;
                    }
                    return;
                }
            }
        } else {
            setCustomLocationAttributelambda2.serializer("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public final void serializer(cancelTimer canceltimer, int i, byte b, int i2) throws IOException {
        String str;
        Status statusIconCompatParcelizer = null;
        boolean z = false;
        if (i2 != 0) {
            boolean z2 = (b & 1) != 0;
            short sMediaBrowserCompatMediaItem = (b & 8) != 0 ? (short) (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() & 255) : (short) 0;
            if ((b & 32) != 0) {
                GifDrawableTransformation gifDrawableTransformation = this.RemoteActionCompatParcelizer;
                gifDrawableTransformation.MediaSessionCompatResultReceiverWrapper();
                gifDrawableTransformation.MediaBrowserCompatMediaItem();
                i -= 5;
            }
            ArrayList arrayList = read(setCustomLocationAttributelambda2.read(i, b, sMediaBrowserCompatMediaItem), sMediaBrowserCompatMediaItem, b, i2);
            parseStringArrayFromJsonStringlambda1 parsestringarrayfromjsonstringlambda1 = parseStringArrayFromJsonStringlambda1.SPDY_SYN_STREAM;
            OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) canceltimer.read;
            r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND;
            if (okHttpCall$1.MediaBrowserCompatMediaItem()) {
                ((java.util.logging.Logger) okHttpCall$1.write).log((Level) okHttpCall$1.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " HEADERS: streamId=" + i2 + " headers=" + arrayList + " endStream=" + z2);
            }
            if (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != Integer.MAX_VALUE) {
                long jSerializer = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1 = (incrementCustomUserAttributelambda1) arrayList.get(i3);
                    jSerializer += (long) (incrementcustomuserattributelambda1.MediaBrowserCompatMediaItem.serializer() + incrementcustomuserattributelambda1.MediaSessionCompatQueueItem.serializer() + 32);
                }
                int iMin = (int) Math.min(jSerializer, 2147483647L);
                int i4 = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (iMin > i4) {
                    Status status = Status.MediaSessionCompatQueueItem;
                    java.util.Locale locale = java.util.Locale.US;
                    if (z2) {
                        str = "trailer";
                    } else {
                        str = "header";
                    }
                    StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Response ", i4, str, " metadata larger than ", ": ");
                    sbM.append(iMin);
                    statusIconCompatParcelizer = status.IconCompatParcelizer(sbM.toString());
                }
            }
            synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).createFullyDrawnExecutor.get(Integer.valueOf(i2));
                if (r8lambda1govqe20wmpp9dwezhg5pphjsce == null) {
                    if (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).IconCompatParcelizer(i2)) {
                        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.write(i2, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.STREAM_CLOSED);
                    } else {
                        z = true;
                    }
                } else if (statusIconCompatParcelizer == null) {
                    getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo._init_lambda1;
                    executelambda2.serializer.getClass();
                    r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo.RemoteActionCompatParcelizer(arrayList, z2);
                } else {
                    if (!z2) {
                        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.write(i2, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.CANCEL);
                    }
                    r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo.RemoteActionCompatParcelizer(statusIconCompatParcelizer, false, new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA());
                }
            }
            if (z) {
                r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.write((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR, "Received header for unknown stream: " + i2);
                return;
            }
            return;
        }
        setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void read(cancelTimer canceltimer, int i, byte b, int i2) throws IOException {
        r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE r8lambda1govqe20wmpp9dwezhg5pphjsce;
        boolean z = (b & 1) != 0;
        if ((b & 32) == 0) {
            short sMediaBrowserCompatMediaItem = (b & 8) != 0 ? (short) (this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() & 255) : (short) 0;
            int i3 = setCustomLocationAttributelambda2.read(i, b, sMediaBrowserCompatMediaItem);
            GifDrawableTransformation gifDrawableTransformation = this.RemoteActionCompatParcelizer;
            ((OkHttpCall$1) canceltimer.read).write(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.INBOUND, i2, gifDrawableTransformation.bufferField, i3, z);
            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
            synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                r8lambda1govqe20wmpp9dwezhg5pphjsce = (r8lambda1GovQe20Wmpp9dwEzHG5PpHJsCE) r8lambda1dlenebwpksdsvf_xikspxtdeu.createFullyDrawnExecutor.get(Integer.valueOf(i2));
            }
            if (r8lambda1govqe20wmpp9dwezhg5pphjsce == null) {
                boolean zIconCompatParcelizer = ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).IconCompatParcelizer(i2);
                r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu2 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                if (zIconCompatParcelizer) {
                    synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                        ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).PlaybackStateCompatCustomAction.write(i2, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.STREAM_CLOSED);
                    }
                    gifDrawableTransformation.RatingCompat(i3);
                } else {
                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.write(r8lambda1dlenebwpksdsvf_xikspxtdeu2, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s.PROTOCOL_ERROR, "Received data for unknown stream: " + i2);
                }
                this.RemoteActionCompatParcelizer.RatingCompat(sMediaBrowserCompatMediaItem);
                return;
            }
            long j = i3;
            gifDrawableTransformation.MediaMetadataCompat(j);
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            registryMissingComponentException.write(gifDrawableTransformation.bufferField, j);
            getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo._init_lambda1;
            executelambda2.serializer.getClass();
            synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                r8lambda1govqe20wmpp9dwezhg5pphjsce.ParcelableVolumeInfo.IconCompatParcelizer(i - i3, registryMissingComponentException, z);
            }
            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu3 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
            int i4 = r8lambda1dlenebwpksdsvf_xikspxtdeu3.MediaMetadataCompat + i;
            r8lambda1dlenebwpksdsvf_xikspxtdeu3.MediaMetadataCompat = i4;
            if (i4 >= r8lambda1dlenebwpksdsvf_xikspxtdeu3.ResultReceiver * 0.5f) {
                synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                    r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu4 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write;
                    r8lambda1dlenebwpksdsvf_xikspxtdeu4.PlaybackStateCompatCustomAction.write(0, r8lambda1dlenebwpksdsvf_xikspxtdeu4.MediaMetadataCompat);
                }
                ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) canceltimer.write).MediaMetadataCompat = 0;
            }
            this.RemoteActionCompatParcelizer.RatingCompat(sMediaBrowserCompatMediaItem);
            return;
        }
        setCustomLocationAttributelambda2.serializer("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        throw null;
    }
}
