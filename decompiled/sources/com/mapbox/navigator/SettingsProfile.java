package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class SettingsProfile implements Serializable {
    private final ProfileApplication application;
    private final ProfilePlatform platform;

    public ProfileApplication getApplication() {
        return this.application;
    }

    public ProfilePlatform getPlatform() {
        return this.platform;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.application, this.platform);
    }

    public SettingsProfile(ProfileApplication profileApplication, ProfilePlatform profilePlatform) {
        this.application = profileApplication;
        this.platform = profilePlatform;
    }

    public String toString() {
        return "[application: " + RecordUtils.fieldToString(this.application) + ", platform: " + RecordUtils.fieldToString(this.platform) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SettingsProfile settingsProfile = (SettingsProfile) obj;
        return Objects.equals(this.application, settingsProfile.application) && Objects.equals(this.platform, settingsProfile.platform);
    }
}
