package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class isInfiniteannotations implements getUnspecifiedNHjbRcannotations {
    public boolean ComponentActivity;
    public boolean IconCompatParcelizer;
    public CharSequence MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public ArrayList MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final ArrayList MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final div7Ah8Wj8 PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public CharSequence RemoteActionCompatParcelizer;
    public ArrayList ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public ArrayList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean read;
    public int serializer;
    public boolean write;

    @Override // o.getUnspecifiedNHjbRcannotations
    public final boolean write(ArrayList arrayList, ArrayList arrayList2) {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.write) {
            return true;
        }
        this.PlaybackStateCompatCustomAction.serializer.add(this);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isInfiniteannotations(isInfiniteannotations isinfiniteannotations) {
        this();
        isinfiniteannotations.PlaybackStateCompatCustomAction.MediaSessionCompatQueueItem();
        isEllipse isellipse = isinfiniteannotations.PlaybackStateCompatCustomAction.PlaybackStateCompat;
        if (isellipse != null) {
            isellipse.RemoteActionCompatParcelizer.getClassLoader();
        }
        for (timesd16Qtg0 timesd16qtg0 : isinfiniteannotations.MediaSessionCompatResultReceiverWrapper) {
            ArrayList arrayList = this.MediaSessionCompatResultReceiverWrapper;
            timesd16Qtg0 timesd16qtg1 = new timesd16Qtg0();
            timesd16qtg1.RemoteActionCompatParcelizer = timesd16qtg0.RemoteActionCompatParcelizer;
            timesd16qtg1.serializer = timesd16qtg0.serializer;
            timesd16qtg1.MediaDescriptionCompat = timesd16qtg0.MediaDescriptionCompat;
            timesd16qtg1.write = timesd16qtg0.write;
            timesd16qtg1.read = timesd16qtg0.read;
            timesd16qtg1.RatingCompat = timesd16qtg0.RatingCompat;
            timesd16qtg1.MediaBrowserCompatMediaItem = timesd16qtg0.MediaBrowserCompatMediaItem;
            timesd16qtg1.MediaSessionCompatQueueItem = timesd16qtg0.MediaSessionCompatQueueItem;
            timesd16qtg1.IconCompatParcelizer = timesd16qtg0.IconCompatParcelizer;
            arrayList.add(timesd16qtg1);
        }
        this.MediaDescriptionCompat = isinfiniteannotations.MediaDescriptionCompat;
        this.PlaybackStateCompat = isinfiniteannotations.PlaybackStateCompat;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = isinfiniteannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = isinfiniteannotations.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = isinfiniteannotations.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        this.write = isinfiniteannotations.write;
        this.IconCompatParcelizer = isinfiniteannotations.IconCompatParcelizer;
        this.ParcelableVolumeInfo = isinfiniteannotations.ParcelableVolumeInfo;
        this.serializer = isinfiniteannotations.serializer;
        this.RemoteActionCompatParcelizer = isinfiniteannotations.RemoteActionCompatParcelizer;
        this.RatingCompat = isinfiniteannotations.RatingCompat;
        this.MediaBrowserCompatMediaItem = isinfiniteannotations.MediaBrowserCompatMediaItem;
        if (isinfiniteannotations.ResultReceiver != null) {
            ArrayList arrayList2 = new ArrayList();
            this.ResultReceiver = arrayList2;
            arrayList2.addAll(isinfiniteannotations.ResultReceiver);
        }
        if (isinfiniteannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            ArrayList arrayList3 = new ArrayList();
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = arrayList3;
            arrayList3.addAll(isinfiniteannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        this.ComponentActivity = isinfiniteannotations.ComponentActivity;
        this.MediaSessionCompatToken = -1;
        this.read = false;
        this.PlaybackStateCompatCustomAction = isinfiniteannotations.PlaybackStateCompatCustomAction;
        this.MediaSessionCompatQueueItem = isinfiniteannotations.MediaSessionCompatQueueItem;
        this.MediaSessionCompatToken = isinfiniteannotations.MediaSessionCompatToken;
        this.read = isinfiniteannotations.read;
    }

    public final void IconCompatParcelizer() {
        ArrayList arrayList = this.MediaSessionCompatResultReceiverWrapper;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) arrayList.get(size);
            if (timesd16qtg0.MediaDescriptionCompat) {
                if (timesd16qtg0.RemoteActionCompatParcelizer == 8) {
                    timesd16qtg0.MediaDescriptionCompat = false;
                    size--;
                    arrayList.remove(size);
                } else {
                    int i = timesd16qtg0.serializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    timesd16qtg0.RemoteActionCompatParcelizer = 2;
                    timesd16qtg0.MediaDescriptionCompat = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        timesd16Qtg0 timesd16qtg1 = (timesd16Qtg0) arrayList.get(i2);
                        if (timesd16qtg1.MediaDescriptionCompat && timesd16qtg1.serializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void IconCompatParcelizer(timesd16Qtg0 timesd16qtg0) {
        this.MediaSessionCompatResultReceiverWrapper.add(timesd16qtg0);
        timesd16qtg0.write = this.MediaDescriptionCompat;
        timesd16qtg0.read = this.PlaybackStateCompat;
        timesd16qtg0.RatingCompat = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        timesd16qtg0.MediaBrowserCompatMediaItem = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public final void read() {
        read(false, true);
    }

    public final void write(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.ParcelableVolumeInfo);
            printWriter.print(" mIndex=");
            printWriter.print(this.MediaSessionCompatToken);
            printWriter.print(" mCommitted=");
            printWriter.println(this.MediaSessionCompatQueueItem);
            if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
            }
            if (this.MediaDescriptionCompat != 0 || this.PlaybackStateCompat != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.MediaDescriptionCompat));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.PlaybackStateCompat));
            }
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != 0 || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
            }
            if (this.RatingCompat != 0 || this.MediaBrowserCompatMediaItem != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.RatingCompat));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.MediaBrowserCompatMediaItem);
            }
            if (this.serializer != 0 || this.RemoteActionCompatParcelizer != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.serializer));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.RemoteActionCompatParcelizer);
            }
        }
        ArrayList arrayList = this.MediaSessionCompatResultReceiverWrapper;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) arrayList.get(i);
            switch (timesd16qtg0.RemoteActionCompatParcelizer) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + timesd16qtg0.RemoteActionCompatParcelizer;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(timesd16qtg0.serializer);
            if (z) {
                if (timesd16qtg0.write != 0 || timesd16qtg0.read != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(timesd16qtg0.write));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(timesd16qtg0.read));
                }
                if (timesd16qtg0.RatingCompat != 0 || timesd16qtg0.MediaBrowserCompatMediaItem != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(timesd16qtg0.RatingCompat));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(timesd16qtg0.MediaBrowserCompatMediaItem));
                }
            }
        }
    }

    public final void IconCompatParcelizer(int i, androidx.fragment.app.Fragment fragment, String str) {
        if (i != 0) {
            read(i, fragment, str, 2);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must use non-zero containerViewId");
        }
    }

    public final void RemoteActionCompatParcelizer(androidx.fragment.app.Fragment fragment) {
        div7Ah8Wj8 div7ah8wj8 = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null || div7ah8wj8 == this.PlaybackStateCompatCustomAction) {
            IconCompatParcelizer(new timesd16Qtg0(fragment, 8));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void read(int i, androidx.fragment.app.Fragment fragment, String str, int i2) {
        String str2 = fragment.onBackPressedInput_delegatelambda0;
        if (str2 != null) {
            androidx.fragment.app.strictmode.FragmentStrictMode.write(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.addOnUserLeaveHintListener;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(sb, fragment.addOnUserLeaveHintListener, " now ", str));
                return;
            }
            fragment.addOnUserLeaveHintListener = str;
        }
        if (i != 0) {
            if (i == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = fragment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i;
            fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i;
        }
        IconCompatParcelizer(new timesd16Qtg0(fragment, i2));
        fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this.PlaybackStateCompatCustomAction;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.MediaSessionCompatToken >= 0) {
            sb.append(" #");
            sb.append(this.MediaSessionCompatToken);
        }
        if (this.ParcelableVolumeInfo != null) {
            sb.append(" ");
            sb.append(this.ParcelableVolumeInfo);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void write(androidx.fragment.app.Fragment fragment) {
        div7Ah8Wj8 div7ah8wj8 = fragment.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (div7ah8wj8 == null || div7ah8wj8 == this.PlaybackStateCompatCustomAction) {
            IconCompatParcelizer(new timesd16Qtg0(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This transaction is already being added to the back stack");
        } else {
            this.IconCompatParcelizer = false;
            this.PlaybackStateCompatCustomAction.serializer(this, false);
        }
    }

    public final int read(boolean z, boolean z2) {
        if (this.MediaSessionCompatQueueItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("commit already called");
            return 0;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new drawRawLines());
            write("  ", printWriter, true);
            printWriter.close();
        }
        this.MediaSessionCompatQueueItem = true;
        boolean z3 = this.write;
        div7Ah8Wj8 div7ah8wj8 = this.PlaybackStateCompatCustomAction;
        if (z3) {
            this.MediaSessionCompatToken = div7ah8wj8.read.getAndIncrement();
        } else {
            this.MediaSessionCompatToken = -1;
        }
        if (z2) {
            div7ah8wj8.RemoteActionCompatParcelizer(this, z);
        }
        return this.MediaSessionCompatToken;
    }

    public final void serializer(int i) {
        if (this.write) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                toString();
            }
            ArrayList arrayList = this.MediaSessionCompatResultReceiverWrapper;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) arrayList.get(i2);
                androidx.fragment.app.Fragment fragment = timesd16qtg0.serializer;
                if (fragment != null) {
                    fragment.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 += i;
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        Objects.toString(timesd16qtg0.serializer);
                        int i3 = timesd16qtg0.serializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public isInfiniteannotations(div7Ah8Wj8 div7ah8wj8) {
        this();
        div7ah8wj8.MediaSessionCompatQueueItem();
        isEllipse isellipse = div7ah8wj8.PlaybackStateCompat;
        if (isellipse != null) {
            isellipse.RemoteActionCompatParcelizer.getClassLoader();
        }
        this.MediaSessionCompatToken = -1;
        this.read = false;
        this.PlaybackStateCompatCustomAction = div7ah8wj8;
    }

    public isInfiniteannotations() {
        this.MediaSessionCompatResultReceiverWrapper = new ArrayList();
        this.IconCompatParcelizer = true;
        this.ComponentActivity = false;
    }
}
