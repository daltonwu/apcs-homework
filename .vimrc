" remember to check help for all of these things

" https://github.com/Anthony25/gnome-terminal-colors-solarized

syntax on
set background=dark
set t_Co=16
colorscheme solarized

" lol, stolen from the wiki: http://vim.wikia.com/wiki/Example_vimrc

" Use case insensitive search, except when using capital letters
set ignorecase
set smartcase

" Allow backspacing over autoindent, line breaks and start of insert action
set backspace=indent,eol,start

" When opening a new line and no filetype-specific indenting is enabled, keep
" the same indent as the line you're currently on. Useful for READMEs, etc.
set autoindent

" Instead of failing a command because of unsaved changes, instead raise a
" dialogue asking if you wish to save changed files.
set confirm

" Usual visual bell instead of beeping when doing something wrong
set visualbell

" Enable use of the mouse for all modes
set mouse=a

" Display line numbers on the left
set number

" Indentation settings for using 4 spaces instead of tabs.
" Do not change 'tabstop' from it default value of 8 with this setup.
set shiftwidth=4
set softtabstop=4
set expandtab

" display indentation guides
set list listchars=tab:❘-,trail:·,extends:»,precedes:«,nbsp:×
