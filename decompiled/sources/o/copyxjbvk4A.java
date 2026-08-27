package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class copyxjbvk4A implements LayoutInflater.Factory2 {
    public final div7Ah8Wj8 write;

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotationsIconCompatParcelizer;
        boolean zEquals = androidx.fragment.app.FragmentContainerView.class.getName().equals(str);
        div7Ah8Wj8 div7ah8wj8 = this.write;
        if (zEquals) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, div7ah8wj8);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RectCompanion.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    if (androidx.fragment.app.Fragment.class.isAssignableFrom(getMaxDimensionannotations.read(context.getClassLoader(), attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1 && resourceId == -1 && string == null) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                        }
                        androidx.fragment.app.Fragment fragmentFindFragmentById = resourceId != -1 ? div7ah8wj8.findFragmentById(resourceId) : null;
                        if (fragmentFindFragmentById == null && string != null) {
                            fragmentFindFragmentById = div7ah8wj8.findFragmentByTag(string);
                        }
                        if (fragmentFindFragmentById == null && id != -1) {
                            fragmentFindFragmentById = div7ah8wj8.findFragmentById(id);
                        }
                        if (fragmentFindFragmentById == null) {
                            getMaxDimensionannotations getmaxdimensionannotationsMediaSessionCompatQueueItem = div7ah8wj8.MediaSessionCompatQueueItem();
                            context.getClassLoader();
                            fragmentFindFragmentById = getmaxdimensionannotationsMediaSessionCompatQueueItem.serializer(attributeValue);
                            fragmentFindFragmentById._init_lambda1 = true;
                            fragmentFindFragmentById.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = resourceId != 0 ? resourceId : id;
                            fragmentFindFragmentById.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = id;
                            fragmentFindFragmentById.addOnUserLeaveHintListener = string;
                            fragmentFindFragmentById.defaultViewModelProviderFactory_delegatelambda0 = true;
                            fragmentFindFragmentById.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = div7ah8wj8;
                            isEllipse isellipse = div7ah8wj8.PlaybackStateCompat;
                            fragmentFindFragmentById._init_lambda4 = isellipse;
                            fragmentFindFragmentById.onInflate((Context) isellipse.RemoteActionCompatParcelizer, attributeSet, fragmentFindFragmentById.addOnMultiWindowModeChangedListener);
                            isspecifieduvyycjkannotationsIconCompatParcelizer = div7ah8wj8.write(fragmentFindFragmentById);
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                fragmentFindFragmentById.toString();
                                Integer.toHexString(resourceId);
                            }
                        } else {
                            if (fragmentFindFragmentById.defaultViewModelProviderFactory_delegatelambda0) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            fragmentFindFragmentById.defaultViewModelProviderFactory_delegatelambda0 = true;
                            fragmentFindFragmentById.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = div7ah8wj8;
                            isEllipse isellipse2 = div7ah8wj8.PlaybackStateCompat;
                            fragmentFindFragmentById._init_lambda4 = isellipse2;
                            fragmentFindFragmentById.onInflate((Context) isellipse2.RemoteActionCompatParcelizer, attributeSet, fragmentFindFragmentById.addOnMultiWindowModeChangedListener);
                            isspecifieduvyycjkannotationsIconCompatParcelizer = div7ah8wj8.IconCompatParcelizer(fragmentFindFragmentById);
                            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                                fragmentFindFragmentById.toString();
                                Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        androidx.fragment.app.strictmode.FragmentStrictMode.IconCompatParcelizer(fragmentFindFragmentById, viewGroup);
                        fragmentFindFragmentById.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = viewGroup;
                        isspecifieduvyycjkannotationsIconCompatParcelizer.MediaDescriptionCompat();
                        isspecifieduvyycjkannotationsIconCompatParcelizer.MediaMetadataCompat();
                        View view2 = fragmentFindFragmentById.getActivityResultRegistry;
                        if (view2 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Fragment ", attributeValue, " did not create a view."));
                            return null;
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragmentFindFragmentById.getActivityResultRegistry.getTag() == null) {
                            fragmentFindFragmentById.getActivityResultRegistry.setTag(string);
                        }
                        fragmentFindFragmentById.getActivityResultRegistry.addOnAttachStateChangeListener(new copyxjbvk4Adefault(this, isspecifieduvyycjkannotationsIconCompatParcelizer));
                        return fragmentFindFragmentById.getActivityResultRegistry;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    public copyxjbvk4A(div7Ah8Wj8 div7ah8wj8) {
        this.write = div7ah8wj8;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
