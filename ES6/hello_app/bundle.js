/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports, __webpack_require__) {

	'use strict';

	var _classes_modules = __webpack_require__(1);

	(0, _classes_modules.classes)(); //document.write('Hello from ES6!!');
	//console.log('ES6 app loaded');

	//import {check_const} from './components/constants.js';
	//check_const();

	//import {check_scope} from './components/scoping.js';
	//check_scope();

	//import {enhanced} from './components/enhancedObjProp.js';
	//enhanced();

	//import {arrow_func} from './components/arrow_functions.js';
	//arrow_func();

	//import {extended} from './components/extendedParameter.js';
	//extended();

	//import {template} from './components/template.js';
	//template();

	//import {destructure} from './components/de-structure.js';
	//destructure();

/***/ },
/* 1 */
/***/ function(module, exports) {

	'use strict';

	Object.defineProperty(exports, "__esModule", {
	    value: true
	});
	exports.classes = classes;

	function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

	function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

	function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

	var Account = function Account(id, name, balance) {
	    _classCallCheck(this, Account);

	    this.acc_id = id;
	    this.acc_name = name;
	    this.balance = balance;
	};

	var Saving = function (_Account) {
	    _inherits(Saving, _Account);

	    function Saving(interest) {
	        _classCallCheck(this, Saving);

	        var _this = _possibleConstructorReturn(this, (Saving.__proto__ || Object.getPrototypeOf(Saving)).call(this, id, name, balance));

	        _this.interest = interest;
	        return _this;
	    }

	    return Saving;
	}(Account);

	var Current = function (_Account2) {
	    _inherits(Current, _Account2);

	    function Current(cash_credit) {
	        _classCallCheck(this, Current);

	        var _this2 = _possibleConstructorReturn(this, (Current.__proto__ || Object.getPrototypeOf(Current)).call(this, id, name, balance));

	        _this2.cash_credit = cash_credit;
	        return _this2;
	    }

	    return Current;
	}(Account);

	function classes() {
	    var savings_1 = new Saving(1, 'Basit', 50000, 1000);
	    var savings_2 = new Saving(2, 'Bhavdeep', 40000, 2000);
	    var current_1 = new Current(3, 'Piyush', 30000, 2000);
	    var current_2 = new Current(4, 'Ammar', 20000, 1000);
	    console.log(savings_1);
	}

/***/ }
/******/ ]);