package androidx.fragment.app;

import android.os.Bundle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.div7Ah8Wj8;
import o.getUnspecifiedNHjbRcannotations;
import o.isInfiniteannotations;
import o.timesd16Qtg0;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentManager$SaveBackStackState implements getUnspecifiedNHjbRcannotations {
    public final /* synthetic */ div7Ah8Wj8 read;
    public final String serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ FragmentManager$SaveBackStackState(div7Ah8Wj8 div7ah8wj8, String str, int i) {
        this.write = i;
        this.read = div7ah8wj8;
        this.serializer = str;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    @Override // o.getUnspecifiedNHjbRcannotations
    public final boolean write(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        String str2;
        Iterator it;
        int i;
        int i2 = this.write;
        String str3 = this.serializer;
        div7Ah8Wj8 div7ah8wj8 = this.read;
        if (i2 != 0) {
            BackStackState backStackState = (BackStackState) div7ah8wj8.IconCompatParcelizer.remove(str3);
            if (backStackState != null) {
                HashMap map = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    isInfiniteannotations isinfiniteannotations = (isInfiniteannotations) it2.next();
                    if (isinfiniteannotations.read) {
                        Iterator it3 = isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.iterator();
                        while (it3.hasNext()) {
                            Fragment fragment = ((timesd16Qtg0) it3.next()).serializer;
                            if (fragment != null) {
                                map.put(fragment.getViewModelStore, fragment);
                            }
                        }
                    }
                }
                ArrayList<String> arrayList3 = backStackState.serializer;
                HashMap map2 = new HashMap(arrayList3.size());
                for (String str4 : arrayList3) {
                    Fragment fragment2 = (Fragment) map.get(str4);
                    if (fragment2 != null) {
                        map2.put(fragment2.getViewModelStore, fragment2);
                    } else {
                        Bundle bundleIconCompatParcelizer = div7ah8wj8.PlaybackStateCompatCustomAction.IconCompatParcelizer(null, str4);
                        if (bundleIconCompatParcelizer != null) {
                            ClassLoader classLoader = div7ah8wj8.PlaybackStateCompat.RemoteActionCompatParcelizer.getClassLoader();
                            Fragment fragmentRemoteActionCompatParcelizer = ((FragmentState) bundleIconCompatParcelizer.getParcelable("state")).RemoteActionCompatParcelizer(div7ah8wj8.MediaSessionCompatQueueItem());
                            fragmentRemoteActionCompatParcelizer.addOnMultiWindowModeChangedListener = bundleIconCompatParcelizer;
                            if (bundleIconCompatParcelizer.getBundle("savedInstanceState") == null) {
                                fragmentRemoteActionCompatParcelizer.addOnMultiWindowModeChangedListener.putBundle("savedInstanceState", new Bundle());
                            }
                            Bundle bundle = bundleIconCompatParcelizer.getBundle("arguments");
                            if (bundle != null) {
                                bundle.setClassLoader(classLoader);
                            }
                            fragmentRemoteActionCompatParcelizer.setArguments(bundle);
                            map2.put(fragmentRemoteActionCompatParcelizer.getViewModelStore, fragmentRemoteActionCompatParcelizer);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (BackStackRecordState backStackRecordState : backStackState.write) {
                    ArrayList arrayList5 = backStackRecordState.MediaMetadataCompat;
                    isInfiniteannotations isinfiniteannotations2 = new isInfiniteannotations(div7ah8wj8);
                    backStackRecordState.read(isinfiniteannotations2);
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        String str5 = (String) arrayList5.get(i3);
                        if (str5 != null) {
                            Fragment fragment3 = (Fragment) map2.get(str5);
                            if (fragment3 != null) {
                                ((timesd16Qtg0) isinfiniteannotations2.MediaSessionCompatResultReceiverWrapper.get(i3)).serializer = fragment3;
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.MediaDescriptionCompat, " failed due to missing saved state for Fragment (", str5, ")"));
                            }
                        }
                    }
                    arrayList4.add(isinfiniteannotations2);
                }
                Iterator it4 = arrayList4.iterator();
                boolean z = false;
                while (it4.hasNext()) {
                    ((isInfiniteannotations) it4.next()).write(arrayList, arrayList2);
                    z = true;
                }
                return z;
            }
            return false;
        }
        int iSerializer = div7ah8wj8.serializer(str3, -1, true);
        if (iSerializer < 0) {
            return false;
        }
        for (int i4 = iSerializer; i4 < div7ah8wj8.serializer.size(); i4++) {
            isInfiniteannotations isinfiniteannotations3 = (isInfiniteannotations) div7ah8wj8.serializer.get(i4);
            if (!isinfiniteannotations3.ComponentActivity) {
                div7ah8wj8.IconCompatParcelizer(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + isinfiniteannotations3 + " that did not use setReorderingAllowed(true)."));
                throw null;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i5 = iSerializer; i5 < div7ah8wj8.serializer.size(); i5++) {
            isInfiniteannotations isinfiniteannotations4 = (isInfiniteannotations) div7ah8wj8.serializer.get(i5);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it5 = isinfiniteannotations4.MediaSessionCompatResultReceiverWrapper.iterator();
            while (it5.hasNext()) {
                timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) it5.next();
                Fragment fragment4 = timesd16qtg0.serializer;
                if (fragment4 != null) {
                    if (timesd16qtg0.MediaDescriptionCompat) {
                        int i6 = timesd16qtg0.RemoteActionCompatParcelizer;
                        it = it5;
                        if (i6 == 1 || i6 == 2 || i6 == 8) {
                        }
                        i = timesd16qtg0.RemoteActionCompatParcelizer;
                        if (i != 1 || i == 2) {
                            hashSet3.add(fragment4);
                        }
                        it5 = it;
                    } else {
                        it = it5;
                    }
                    hashSet.add(fragment4);
                    hashSet2.add(fragment4);
                    i = timesd16qtg0.RemoteActionCompatParcelizer;
                    if (i != 1) {
                        hashSet3.add(fragment4);
                    } else {
                        hashSet3.add(fragment4);
                    }
                    it5 = it;
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str2 = " " + hashSet2.iterator().next();
                } else {
                    str2 = "s " + hashSet2;
                }
                sbM.append(str2);
                sbM.append(" in ");
                sbM.append(isinfiniteannotations4);
                sbM.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                div7ah8wj8.IconCompatParcelizer(new IllegalArgumentException(sbM.toString()));
                throw null;
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment5 = (Fragment) arrayDeque.removeFirst();
            if (fragment5.onBackPressedDispatcher_delegatelambda00) {
                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment5)) {
                    str = "direct reference to retained ";
                } else {
                    str = "retained child ";
                }
                sbM2.append(str);
                sbM2.append("fragment ");
                sbM2.append(fragment5);
                div7ah8wj8.IconCompatParcelizer(new IllegalArgumentException(sbM2.toString()));
                throw null;
            }
            for (Fragment fragment6 : fragment5.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer()) {
                if (fragment6 != null) {
                    arrayDeque.addLast(fragment6);
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((Fragment) it6.next()).getViewModelStore);
        }
        ArrayList arrayList7 = new ArrayList(div7ah8wj8.serializer.size() - iSerializer);
        for (int i7 = iSerializer; i7 < div7ah8wj8.serializer.size(); i7++) {
            arrayList7.add(null);
        }
        BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
        for (int size = div7ah8wj8.serializer.size() - 1; size >= iSerializer; size--) {
            isInfiniteannotations isinfiniteannotations5 = (isInfiniteannotations) div7ah8wj8.serializer.remove(size);
            isInfiniteannotations isinfiniteannotations6 = new isInfiniteannotations(isinfiniteannotations5);
            isinfiniteannotations6.IconCompatParcelizer();
            arrayList7.set(size - iSerializer, new BackStackRecordState(isinfiniteannotations6));
            isinfiniteannotations5.read = true;
            arrayList.add(isinfiniteannotations5);
            arrayList2.add(Boolean.TRUE);
        }
        div7ah8wj8.IconCompatParcelizer.put(str3, backStackState2);
        return true;
    }
}
