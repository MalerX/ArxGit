package org.john.arxgit.classes.rules;

import org.john.arxgit.classes.git.IMergeRequest;

public interface IRule {
    Boolean isMatch(IMergeRequest mergeRequest);
}
