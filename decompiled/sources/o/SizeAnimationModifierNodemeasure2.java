package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class SizeAnimationModifierNodemeasure2 implements CameraValidatorCameraIdListIncorrectException {
    public final /* synthetic */ int read;
    public final Object serializer;

    public /* synthetic */ SizeAnimationModifierNodemeasure2(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[LOOP:1: B:22:0x0069->B:24:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9 A[LOOP:2: B:29:0x00e3->B:31:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0104 A[Catch: Exception -> 0x016d, LOOP:3: B:33:0x00fe->B:35:0x0104, LOOP_END, TryCatch #0 {Exception -> 0x016d, blocks: (B:32:0x00f7, B:33:0x00fe, B:35:0x0104, B:36:0x0112, B:38:0x0116, B:39:0x0122, B:41:0x012a, B:42:0x0138, B:44:0x013e, B:45:0x014b, B:46:0x0154, B:48:0x015a, B:49:0x0168), top: B:102:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0116 A[Catch: Exception -> 0x016d, TryCatch #0 {Exception -> 0x016d, blocks: (B:32:0x00f7, B:33:0x00fe, B:35:0x0104, B:36:0x0112, B:38:0x0116, B:39:0x0122, B:41:0x012a, B:42:0x0138, B:44:0x013e, B:45:0x014b, B:46:0x0154, B:48:0x015a, B:49:0x0168), top: B:102:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x012a A[Catch: Exception -> 0x016d, TryCatch #0 {Exception -> 0x016d, blocks: (B:32:0x00f7, B:33:0x00fe, B:35:0x0104, B:36:0x0112, B:38:0x0116, B:39:0x0122, B:41:0x012a, B:42:0x0138, B:44:0x013e, B:45:0x014b, B:46:0x0154, B:48:0x015a, B:49:0x0168), top: B:102:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013e A[Catch: Exception -> 0x016d, LOOP:4: B:42:0x0138->B:44:0x013e, LOOP_END, TryCatch #0 {Exception -> 0x016d, blocks: (B:32:0x00f7, B:33:0x00fe, B:35:0x0104, B:36:0x0112, B:38:0x0116, B:39:0x0122, B:41:0x012a, B:42:0x0138, B:44:0x013e, B:45:0x014b, B:46:0x0154, B:48:0x015a, B:49:0x0168), top: B:102:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x015a A[Catch: Exception -> 0x016d, LOOP:5: B:46:0x0154->B:48:0x015a, LOOP_END, TryCatch #0 {Exception -> 0x016d, blocks: (B:32:0x00f7, B:33:0x00fe, B:35:0x0104, B:36:0x0112, B:38:0x0116, B:39:0x0122, B:41:0x012a, B:42:0x0138, B:44:0x013e, B:45:0x014b, B:46:0x0154, B:48:0x015a, B:49:0x0168), top: B:102:0x00f7 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Object obj) {
        androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory;
        List list;
        ArrayList arrayList;
        ImageCaptureException imageCaptureException;
        List listPlaybackStateCompat;
        Set setRemoteActionCompatParcelizer;
        Set setRemoteActionCompatParcelizer2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        Iterator it2;
        androidx.camera.core.impl.CameraRepository cameraRepository;
        Iterator it3;
        int i = this.read;
        if (i == 0) {
            AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure1 = (AnimatedEnterExitMeasurePolicymeasure1) obj;
            androidx.camera.video.VideoCapture videoCapture = (androidx.camera.video.VideoCapture) this.serializer;
            if (animatedEnterExitMeasurePolicymeasure1 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("StreamInfo can't be null");
                return;
            }
            if (videoCapture.RatingCompat == InfiniteTransitionrun113.INACTIVE) {
                return;
            }
            Objects.toString(videoCapture.ParcelableVolumeInfo);
            animatedEnterExitMeasurePolicymeasure1.toString();
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
            AnimatedEnterExitMeasurePolicymeasure1 animatedEnterExitMeasurePolicymeasure2 = videoCapture.ParcelableVolumeInfo;
            videoCapture.ParcelableVolumeInfo = animatedEnterExitMeasurePolicymeasure1;
            SmallDisplaySizeQuirk smallDisplaySizeQuirk = videoCapture.MediaSessionCompatToken;
            smallDisplaySizeQuirk.getClass();
            int i2 = animatedEnterExitMeasurePolicymeasure2.serializer;
            int i3 = animatedEnterExitMeasurePolicymeasure1.serializer;
            Set set = AnimatedEnterExitMeasurePolicymeasure1.RemoteActionCompatParcelizer;
            if (!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i3)) && i2 != i3) {
                videoCapture.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                return;
            }
            int i4 = animatedEnterExitMeasurePolicymeasure2.serializer;
            if ((i4 != -1 && i3 == -1) || (i4 == -1 && i3 != -1)) {
                videoCapture.IconCompatParcelizer(videoCapture.MediaMetadataCompat, animatedEnterExitMeasurePolicymeasure1, smallDisplaySizeQuirk);
                Object[] objArr = {videoCapture.MediaMetadataCompat.RemoteActionCompatParcelizer()};
                ArrayList arrayList4 = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                videoCapture.RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList4));
                videoCapture.ParcelableVolumeInfo();
                return;
            }
            if (animatedEnterExitMeasurePolicymeasure2.write != animatedEnterExitMeasurePolicymeasure1.write) {
                videoCapture.IconCompatParcelizer(videoCapture.MediaMetadataCompat, animatedEnterExitMeasurePolicymeasure1, smallDisplaySizeQuirk);
                Object[] objArr2 = {videoCapture.MediaMetadataCompat.RemoteActionCompatParcelizer()};
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = objArr2[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                videoCapture.RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList5));
                Iterator it4 = videoCapture.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.iterator();
                while (it4.hasNext()) {
                    ((Camera2CapturePipelineScreenFlashTask) it4.next()).read(videoCapture);
                }
                return;
            }
            return;
        }
        if (i != 1) {
            ((FocusOwnerImplmodifier1) this.serializer).accept(obj);
            return;
        }
        List list2 = (List) obj;
        if (((ImageCaptureException) this.serializer).MediaMetadataCompat.get() && (camera2CameraFactory = ((ImageCaptureException) this.serializer).RemoteActionCompatParcelizer) != null) {
            try {
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (true) {
                        list = arrayList6;
                        if (!it5.hasNext()) {
                            break;
                        } else {
                            arrayList6.add(((getNavButtonView) it5.next()).write());
                        }
                    }
                    camera2CameraFactory.IconCompatParcelizer(list);
                    LinkedHashSet<String> linkedHashSetIconCompatParcelizer = camera2CameraFactory.IconCompatParcelizer();
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(linkedHashSetIconCompatParcelizer, 10));
                    for (String str : linkedHashSetIconCompatParcelizer) {
                        str.getClass();
                        arrayList.add(new getNavButtonView((ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer()), null));
                    }
                    imageCaptureException = (ImageCaptureException) this.serializer;
                    listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(imageCaptureException.read);
                    if (arrayList.equals(listPlaybackStateCompat)) {
                        return;
                    }
                    List list4 = listPlaybackStateCompat;
                    Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list4);
                    Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
                    setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2, (Iterable) setR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    setRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, (Iterable) setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2);
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((getNavButtonView) it.next()).write());
                    }
                    try {
                        it2 = setRemoteActionCompatParcelizer2.iterator();
                        while (it2.hasNext()) {
                            imageCaptureException.IconCompatParcelizer(((getNavButtonView) it2.next()).write());
                        }
                        cameraRepository = imageCaptureException.IconCompatParcelizer;
                        if (cameraRepository != null) {
                            setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                            cameraRepository.IconCompatParcelizer(arrayList3);
                            arrayList2.add(cameraRepository);
                            setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                        }
                        if (!imageCaptureException.MediaDescriptionCompat.isEmpty()) {
                            imageCaptureException.MediaDescriptionCompat.size();
                            setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                            for (getImageFormat getimageformat : imageCaptureException.MediaDescriptionCompat) {
                                getimageformat.IconCompatParcelizer(arrayList3);
                                arrayList2.add(getimageformat);
                            }
                        }
                        imageCaptureException.read = arrayList;
                        it3 = setRemoteActionCompatParcelizer.iterator();
                        while (it3.hasNext()) {
                            imageCaptureException.RemoteActionCompatParcelizer(((getNavButtonView) it3.next()).write());
                        }
                        imageCaptureException.serializer(setRemoteActionCompatParcelizer, setRemoteActionCompatParcelizer2);
                    } catch (Exception e) {
                        setInflatedId.read("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e);
                        ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                        Iterator it6 = list4.iterator();
                        while (it6.hasNext()) {
                            arrayList7.add(((getNavButtonView) it6.next()).write());
                        }
                        Iterator it7 = new bindViewHolderlambda0(arrayList2).iterator();
                        while (true) {
                            BaseContentCardView baseContentCardView = (BaseContentCardView) it7;
                            if (!baseContentCardView.write.hasPrevious()) {
                                break;
                            }
                            getImageFormat getimageformat2 = (getImageFormat) baseContentCardView.write.previous();
                            try {
                                getimageformat2.IconCompatParcelizer(arrayList7);
                            } catch (Exception e2) {
                                setInflatedId.read("CameraPresencePrvdr", "Failed to rollback listener: " + getimageformat2, e2);
                            }
                        }
                        Iterator it8 = setRemoteActionCompatParcelizer2.iterator();
                        while (it8.hasNext()) {
                            imageCaptureException.RemoteActionCompatParcelizer(((getNavButtonView) it8.next()).write());
                        }
                        Iterator it9 = setRemoteActionCompatParcelizer.iterator();
                        while (it9.hasNext()) {
                            imageCaptureException.IconCompatParcelizer(((getNavButtonView) it9.next()).write());
                        }
                        return;
                    }
                }
                list = instance_delegatelambda0.write;
                camera2CameraFactory.IconCompatParcelizer(list);
                LinkedHashSet<String> linkedHashSetIconCompatParcelizer2 = camera2CameraFactory.IconCompatParcelizer();
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(linkedHashSetIconCompatParcelizer2, 10));
                while (r13.hasNext()) {
                    str.getClass();
                    arrayList.add(new getNavButtonView((ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer()), null));
                }
                imageCaptureException = (ImageCaptureException) this.serializer;
                listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(imageCaptureException.read);
                if (arrayList.equals(listPlaybackStateCompat)) {
                    return;
                }
                List list5 = listPlaybackStateCompat;
                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys3 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list5);
                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys4 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
                setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys4, (Iterable) setR8lambda54BeH8ZsBru0CXI2CCSP2syNys3);
                setRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys3, (Iterable) setR8lambda54BeH8ZsBru0CXI2CCSP2syNys4);
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((getNavButtonView) it.next()).write());
                }
                it2 = setRemoteActionCompatParcelizer2.iterator();
                while (it2.hasNext()) {
                    imageCaptureException.IconCompatParcelizer(((getNavButtonView) it2.next()).write());
                }
                cameraRepository = imageCaptureException.IconCompatParcelizer;
                if (cameraRepository != null) {
                    setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                    cameraRepository.IconCompatParcelizer(arrayList3);
                    arrayList2.add(cameraRepository);
                    setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                }
                if (!imageCaptureException.MediaDescriptionCompat.isEmpty()) {
                    imageCaptureException.MediaDescriptionCompat.size();
                    setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                    while (r3.hasNext()) {
                        getimageformat.IconCompatParcelizer(arrayList3);
                        arrayList2.add(getimageformat);
                    }
                }
                imageCaptureException.read = arrayList;
                it3 = setRemoteActionCompatParcelizer.iterator();
                while (it3.hasNext()) {
                    imageCaptureException.RemoteActionCompatParcelizer(((getNavButtonView) it3.next()).write());
                }
                imageCaptureException.serializer(setRemoteActionCompatParcelizer, setRemoteActionCompatParcelizer2);
            } catch (Exception e3) {
                setInflatedId.read("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e3);
                setSelector setselector = ((ImageCaptureException) this.serializer).MediaSessionCompatToken;
                if (setselector != null) {
                    setselector.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Throwable th) {
        int i = this.read;
        if (i == 0) {
            setInflatedId.RemoteActionCompatParcelizer("VideoCapture", "Receive onError from StreamState observer", th);
            return;
        }
        if (i != 1) {
            setInflatedId.read("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
            return;
        }
        th.getClass();
        ImageCaptureException imageCaptureException = (ImageCaptureException) this.serializer;
        if (imageCaptureException.MediaMetadataCompat.get()) {
            setInflatedId.read("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
            setSelector setselector = imageCaptureException.MediaSessionCompatToken;
            if (setselector != null) {
                setselector.RemoteActionCompatParcelizer();
            }
        }
    }
}
