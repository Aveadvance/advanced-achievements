package com.advanceachievements.data.dao;

import java.util.List;

import com.aveadvance.advancedachievements.data.entities.UserTaskCategory;
import com.aveadvance.advancedachievements.data.entities.Workspace;

public interface UserTaskCategoryDao extends Repo<UserTaskCategory, Long> {

	List<UserTaskCategory> retrieveAll(Workspace workspace);
	
}
