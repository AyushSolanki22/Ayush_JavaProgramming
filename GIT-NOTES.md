# Git & GitHub Notes

## 🧠 Introduction

* **Git** → A Version Control System (VCS) used to track and manage code history.
* **GitHub** → A platform used to store, manage, and collaborate on Git repositories online.
* **Repository (Repo)** → A project folder tracked using Git.
* **README.md** → A file used to explain the project, notes, setup, workflow, etc.

---

# 🔧 1. Installation & Setup

## Install Required Tools

* VS Code
* Git
* Git Bash (Windows)
* Terminal (Linux/macOS)

## Verify Git Installation

```bash
git --version
```

---

# ⚙️ 2. Configure Git

```bash
git config --global user.name "Your Name"   //this will configure author globally
git config user.name "Your Name"            
//(without global keyword) this will configure locally (helping in maintaining multiple users at a dekstop operating different github accounts)

git config --global user.email "your_email@gmail.com"

git config --list
```

### Available Terminals

* VS Code Terminal
* CMD
* Git Bash
* Linux Terminal

---

# 📁 3. Basic Commands

## Clone Repository

```bash
git clone <repository-link>
```

Used to download a remote repository to local system.

---

## Check Repository Status

```bash
git status
```

---

## Directory Commands

```bash
pwd                 # Current directory

cd <folder-name>   # Change directory

mkdir <folder>     # Create new folder

rmdir <folder>     # Remove folder

ls                  # List files

ls -a               # Show hidden files

clear / cls         # Clear terminal

q                   # Quit output/help
```

---

# 🔄 4. Git Workflow

## Git File States

### Untracked

New files not yet tracked by Git.

### Modified

Tracked files that have been changed.

### Staged

Files ready to be committed.

### Unmodified

Files unchanged after commit.

---

## Workflow

```text
Change/New File
        ↓
git add
        ↓
git commit
        ↓
git push
```

---

## Add Files

```bash
git add <file-name>

git add .
```

---

## Commit Changes

```bash
git commit -m "commit message"
```

A commit is a saved snapshot/history of changes.

---

## Push Changes

```bash
git push origin main
```

Uploads local repository content to GitHub.

---

## Review Changes

```bash
git diff
```

Used to compare and review changes.

---

# 🚀 5. Creating a New Repository

## Initialize Git

```bash
git init
```

Used to initialize Git inside a project folder.

---

## Connect Local Repository to GitHub

```bash
git remote add origin <repository-link>
```

Before this:

* Create repository on GitHub first.

---

## Verify Remote

```bash
git remote -v
```

---

## Check Branch

```bash
git branch
```

---

## Rename Branch

```bash
git branch -M main
```

---

## Push Repository

```bash
git push origin main
```

OR

```bash
git push -u origin main
```

`-u` sets upstream branch for future pushes.

---

# 🌿 6. Branch Commands

## Create & Switch Branch

```bash
git checkout -b <new-branch-name>
```

---

## Switch Branch

```bash
git checkout <branch-name>
```

---

## Delete Branch

```bash
git branch -d <branch-name>
```

---

# 🔀 7. Merging Code

## Compare Branches

```bash
git diff <branch-name>
```

---

## Merge Branch

```bash
git merge <branch-name>
```

---

# 🔁 Pull Request (PR)

A Pull Request allows developers to propose changes to a repository branch on GitHub.

Usually reviewed and approved by senior developers/team leads before merging.

---

# ⬇️ Pull Remote Changes

```bash
git pull origin main
```

Used to:

* fetch remote changes
* download updates
* sync local repository with GitHub

---

# ⚠️ 8. Merge Conflicts

Merge conflicts occur when Git cannot automatically merge changes.

Conflicts are resolved manually using a code editor like VS Code.

---

# 🧼 9. Undoing Changes

## Undo Staged Changes

```bash
git reset <file-name>

git reset
```

---

## Undo Latest Commit

```bash
git reset HEAD~1
```

`HEAD~1` refers to latest commit.

---

## Reset to Specific Commit

```bash
git reset <commit-hash>
```

---

## Hard Reset

```bash
git reset --hard <commit-hash>
```

Removes changes locally and resets commit history.

---

# 🍴 10. Fork

A Fork is a copy of another repository.

Used for:

* experimenting
* contributing to open-source projects
* creating independent versions of repositories

---

# 🔐 Authentication

GitHub no longer supports password authentication for Git operations.

Use:

* Personal Access Token (PAT)
  OR
* SSH Keys

---

## Personal Access Token (PAT)

### Generate PAT

GitHub → Settings → Developer Settings → Personal Access Tokens → Generate New Token (Classic)

Select:

```text
repo
```

permission while generating token.

---

## While Pushing

```text
Username → GitHub username

Password → Personal Access Token
```

---

## Avoid Entering Username & Token Every Time

Run this command once:

```bash
git config --global credential.helper store
```

After running it:

* Git stores credentials locally
* Username/token will be remembered
* Future pushes won't ask repeatedly

---

## Push Normally

```bash
git push origin main
```

---



# 🔑 SSH Key Setup

## New Laptop Checklist

```text
Generate SSH key
Start SSH agent
Add key to agent
Copy public key
Add key to GitHub
Test SSH connection
Configure Git identity
Clone repo using SSH
```

---

## Generate SSH Key

```bash
ssh-keygen -t ed25519 -C "your_email@example.com"
```

Press Enter 3 times.

---

## Start SSH Agent

```bash
eval "$(ssh-agent -s)"

ssh-add ~/.ssh/id_ed25519
```

---

## Copy Public Key

```bash
cat ~/.ssh/id_ed25519.pub
```

Add this key to:
GitHub → Settings → SSH Keys

---

## Test SSH Connection

```bash
ssh -T git@github.com
```

---

## Configure Git Identity

```bash
git config --global user.name "Your Name"

git config --global user.email "your_email@example.com"
```

---

## Use SSH Instead of HTTPS

```bash
git config --global url."git@github.com:".insteadOf "https://github.com/"
```

---

# 🔄 Using SSH with Git

## Clone Repository Using SSH

```bash
git clone git@github.com:username/repository.git
```

---

## Change Existing Repository to SSH

### Check Current Remote

```bash
git remote -v
```

---

### Change HTTPS to SSH

```bash
git remote set-url origin git@github.com:username/repository.git
```

---

### Verify Remote

```bash
git remote -v
```

---

# 🚀 Push with SSH

```bash
git add .

git commit -m "commit message"

git push origin main
```

No repeated authentication prompts.

---

# 💾 Backup SSH Keys

## Create Backup

```bash
tar -czf ssh_backup.tar.gz ~/.ssh/
```

Store securely.

---

# ⚠️ Troubleshooting

## Permission Denied (publickey)

```bash
ssh-add -l
```

Check:

* SSH key loaded or not
* key added to GitHub
* permissions correct or not

---

## File Permissions

```bash
chmod 700 ~/.ssh

chmod 600 ~/.ssh/id_ed25519

chmod 644 ~/.ssh/id_ed25519.pub
```

---

## First Connection Warning

```bash
ssh -T git@github.com
```

If asked:

```text
Are you sure you want to continue connecting?
```

Type:

```text
yes
```

---

## Contributions Not Showing on GitHub

Check current email:

```bash
git config user.email
```

Check commit author:

```bash
git show --format=fuller -s HEAD
```

Ensure the email used in commits is verified on GitHub.

GitHub → Settings → Emails

If using multiple GitHub accounts:

* Use global configuration for your primary account.
* Use local repository configuration for secondary accounts.
* GitHub contributions are counted using the commit email.
* Wrong commit email may cause commits to appear in repositories but not on the GitHub contribution graph.

---

# 🧠 Important Notes

* Git works repository-wise.
* Git only tracks repositories initialized using `git init`.
* Multiple repositories from different GitHub accounts can exist on the same computer.
* Each project is independent.
* Avoid initializing Git in huge parent folders.
* Git tracks files, not empty folders/directories.
* GitHub contributions are counted using the commit email.
* Ensure `git config user.email` matches a verified email on your GitHub account.
* Different repositories can use different Git identities through local configuration.

---

# ✍️ Author

Ayush Solanki